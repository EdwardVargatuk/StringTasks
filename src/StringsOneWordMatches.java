import java.util.*;
import java.util.stream.Collectors;

// There is a text and a list of words. For each word from the given list look for how many times it is found in the text, and sort
//        words by decreasing the total number of occurrences.
public class StringsOneWordMatches {

    private List<String> listOfWordsInFile = new ArrayList<>();
    private Map<String, Integer> treeMap;

    private List<String> getListOfWordsInFile() {
        return listOfWordsInFile;
    }

    private Map<String, Integer> getTreeMap() {
        return treeMap;
    }

    private void read(String words) {
        Scanner reader = new Scanner(words);
        while (reader.hasNext()) {
            String str = reader.next().replaceAll("[,.\";:?!\\-+|\\[\\](){}`’']", "");
            listOfWordsInFile.add(str);
        }
    }

    private void countingWordsInText(List<String> words) {
        List<String> list = new ArrayList<>();

        listOfWordsInFile.forEach(nested -> words.stream().distinct().filter(nested::equalsIgnoreCase).forEach(list::add));
        treeMap = words.stream().distinct().collect(Collectors.toMap(x -> x, x -> Collections.frequency(list, x)))
                .entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e2,
                        LinkedHashMap::new));
    }

    private void sortWordsAccordingTheirFrequency(String words, List<String> forFrequency) {
        listOfWordsInFile.clear();
        read(words);
        System.out.println(getListOfWordsInFile());
        countingWordsInText(forFrequency);
        Map<String, Integer> treeMap1 = getTreeMap();
        treeMap1.forEach((key, value) -> System.out.println(key + " = " + value));
    }

    public static void main(String[] args) {
        String text = "In Spring, the objects that form the backbone of your application and that are managed by the Spring IoC container are called beans. ";
        StringsOneWordMatches stringsOneWordMatches = new StringsOneWordMatches();
        List<String> lists = new ArrayList<>();
        lists.add("Intellij");
        lists.add("and");
        lists.add("and");
        lists.add("THE");
        lists.add("best");
        lists.add("for");
        lists.add("spring");

        stringsOneWordMatches.sortWordsAccordingTheirFrequency(text, lists);
    }
}
