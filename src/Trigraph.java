import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Trigraph {

    private List<String> listOfWordsInFile = new ArrayList<>();

    //just change for Digraph, Tetragraph, Pentagraph and so on
    private static final int NUMBERGRAPH = 3;

    private List<String> getListOfWordsInFile() {
        return listOfWordsInFile;
    }

    private void read(File file) {
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNext()) {
                String str = reader.next().replaceAll("[,.\";:?!\\-+|\\[\\](){}`’']", "");
                listOfWordsInFile.add(str);
            }
        } catch (IOException e) {
            System.out.println("Error reading file named '" + "'");
        }
    }

    private Map<String, Long> divideToGraph(List<String> words) {
        List<List<String>> stream;
        Map<String, Long> treeMap;

        stream = words.stream().filter(l -> l.length() >= NUMBERGRAPH)
                .flatMap((x) -> {
                    List<String> list = new ArrayList<>();
                    IntStream.range(0, x.length() - (NUMBERGRAPH - 1))
                            .forEach((u) -> list.add(x.toUpperCase().substring(u, NUMBERGRAPH + u)));
                    return Stream.of(list);
                })
                .collect(Collectors.toList());

        treeMap = stream.stream().flatMap(Collection::stream)
                .collect(Collectors.groupingBy(key -> key, TreeMap::new, Collectors.counting()));
        return treeMap;
    }

    public static void main(String[] args) {
        File file = new File("src/test.txt");
        Trigraph trigraph = new Trigraph();
        trigraph.read(file);
        Map<String, Long> treeMap = trigraph.divideToGraph(trigraph.getListOfWordsInFile());
        treeMap.forEach((key, value) -> System.out.println(key + " = " + value));
    }
}

