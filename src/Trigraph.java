import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Trigraph {

    private List<String> listOfWordsInFile = new ArrayList<>();
    private Map<String, Long> treeMap;

    private void setNUMBERGRAPH(int NUMBERGRAPH) {
        this.NUMBERGRAPH = NUMBERGRAPH;
    }

    //just change for Digraph, Tetragraph, Pentagraph and so on
    private int NUMBERGRAPH;

    private List<String> getListOfWordsInFile() {
        return listOfWordsInFile;
    }

    private Map<String, Long> getTreeMap() {
        return treeMap;
    }

    private void read(String file) {
        try {
            listOfWordsInFile = (Arrays.asList(new String(Files.readAllBytes(Paths.get(file)), StandardCharsets.UTF_8)
                    .replaceAll("[,.\";:?!\\-+|\\[\\](){}`’'\n]", "").split(" ")));
        } catch (IOException e) {
            System.out.println("Error reading file named '" + file);
        }
    }

    private void divideToGraph(List<String> words) {

        treeMap = words.stream().filter(l -> l.length() >= NUMBERGRAPH)
                .flatMap((x) -> {
                    List<String> list = new ArrayList<>();
                    IntStream.range(0, x.length() - (NUMBERGRAPH - 1))
                            .forEach((u) -> list.add(x.toUpperCase().substring(u, NUMBERGRAPH + u)));
                    return Stream.of(list);
                })
                .collect(Collectors.toList()).stream().flatMap(Collection::stream)
                .collect(Collectors.groupingBy(key -> key, TreeMap::new, Collectors.counting()));
    }

    private void readAndDivideToGraphsFile(String file, int numOfGraphs) {
        read(file);
        setNUMBERGRAPH(numOfGraphs);
        divideToGraph(getListOfWordsInFile());
        Map<String, Long> treeMap = getTreeMap();
        treeMap.forEach((key, value) -> System.out.println(key + " = " + value));
    }

    public static void main(String[] args) {
        String file = "src/test.txt";
        Trigraph trigraph = new Trigraph();
        trigraph.readAndDivideToGraphsFile(file, 3);
    }
}

