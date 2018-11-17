import java.io.File;
import java.io.IOException;
import java.util.*;

public class Trigraph {

    //just change for Digraph, Tetragraph, Pentagraph and so on
    private static final int NUMBERGRAPH = 3;

    private List<String> read(File file) {
        List<String> listOfWordsInFile = new ArrayList<>();
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNext()) {
                String str = reader.next().replaceAll("[,.\";:?!\\-+|\\[\\](){}`’']", "");
                listOfWordsInFile.add(str);
            }
        } catch (IOException e) {
            System.out.println("Error reading file named '" + "'");
        }
        return listOfWordsInFile;
    }

    private Map<String, Integer> divideToGraph(List<String> words) {
        List<String> listOfGraphs = new ArrayList<>();
        for (String strings : words) {
            if (strings.length() >= NUMBERGRAPH)
                for (int i = 0; i < strings.length() - (NUMBERGRAPH - 1); i++) {
                    listOfGraphs.add(strings.toUpperCase().substring(i, i + NUMBERGRAPH));
                }
        }
        Map<String, Integer> treeMap = new TreeMap<>();
        Integer count;
        for (String strFromListOfGraph : listOfGraphs) {
            count = treeMap.get(strFromListOfGraph);
            treeMap.put(strFromListOfGraph, count == null ? 1 : count + 1);
        }
        return treeMap;
    }

    public static void main(String[] args) {
        File file = new File("src/test.txt");
        Trigraph trigraph = new Trigraph();
        Map<String, Integer> treeMap = trigraph.divideToGraph(trigraph.read(file));
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " = " + value);
        }
//        System.out.println(trigraph.divideToGraph(trigraph.read(file)));
    }
}

