import java.util.*;
import java.util.stream.Collectors;


public class StringsOne {

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
        Map<String, Long> treeMapWithout0;
        Map<String, Integer> treeMapWithout= new TreeMap<>();
        List<Integer> longs= new ArrayList<>();
        listOfWordsInFile.forEach(nested -> words.stream().filter(nested::equalsIgnoreCase).forEach(list::add));
        for (String word : words) {


            int lon = Collections.frequency(list, word);
            longs.add(lon);
            treeMapWithout.put(word, lon);
        }
        System.out.println(treeMapWithout);
        System.out.println(longs);
//        treeMapWithout0 = list.stream().collect(Collectors.groupingBy(key -> key, Collectors.counting()));
//
//        words.stream().filter(w -> !treeMapWithout0.containsKey(w)).forEach(x -> treeMapWithout0.put(x, (long) 0));

        treeMap = treeMapWithout.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).collect(Collectors.toMap(Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e2,
                        LinkedHashMap::new));

//        treeMapWithout.entrySet().stream()
//                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
//                .forEach(System.out::println);

//        treeMapWithout0 = listOfWordsInFile.stream().filter((i)->words.get(2).equalsIgnoreCase(i)).collect(Collectors.groupingBy(key -> key, Collectors.counting()));
//        System.out.println(treeMapWithout0);
//
//        Predicate<Boolean> predicate = i->treeMapWithout0.containsKey(i);
//words.stream().filter(i->treeMapWithout0.containsKey(i)).forEach(System.out::println);
//        treeMapWithout0.entrySet().forEach((nested,x) -> words.stream().filter(i->nested.equalsIgnoreCase(i)).forEach(System.out::println));
//       treeMapWithout0.entrySet().stream().forEach(nested -> words.stream().filter(i->nested.getKey().equalsIgnoreCase(i)).forEach(System.out::println));
//                .sorted(Map.Entry.comparingByValue(Collections.reverseOrder())).collect(Collectors.toMap(Map.Entry::getKey,
//                        Map.Entry::getValue,
//                        (e1, e2) -> e2,
//                        LinkedHashMap::new));
    }

    private void sortWordsAccordingTheirFrequency(String words, List<String> forFrequency) {
        read(words);
        System.out.println(listOfWordsInFile);
        countingWordsInText(forFrequency);
        Map<String, Integer> treeMap1 = getTreeMap();
        treeMap1.forEach((key, value) -> System.out.println(key + " = " + value));
    }

    public static void main(String[] args) {
        String text = "In Spring, the objects that form the backbone of your application and that are managed by the Spring IoC container are called beans. ";
        StringsOne stringsOne = new StringsOne();
        List<String> lists = new ArrayList<>();
        lists.add("Intellij");
        lists.add("and");
        lists.add("THE");
        lists.add("best");
        lists.add("for");
        lists.add("spring");

        stringsOne.sortWordsAccordingTheirFrequency(text, lists);


        //        for (String word : words) {
//            if (!treeMapWithout0.containsKey(word))
//
//                treeMapWithout0.put(word, (long) 0);
//        }
//        System.out.println(treeMapWithout0.entrySet());


        //      words.forEach(a->list.stream().filter(w->a.equalsIgnoreCase(w)).collect(Collectors.groupingBy(key -> key,  Collectors.counting() )).entrySet().forEach(System.out::println));
        //        list= listOfWordsInFile.stream().filter(w->"s".equalsIgnoreCase(w)).collect(Collectors.toList());
//        int bound = words.size();
//        List<String> list = new ArrayList<>();
//                for (String st : listOfWordsInFile) {
//
//                for (String strings : words) {
//                    if (strings.equalsIgnoreCase(st))
//                    list.add(st);
//                }
//        }
//        Stream.concat(Stream.of(list), Stream.of(words)).forEach(System.out::println);


        //            if (words.get(u).equalsIgnoreCase(w)) {
//                list.add(words.get(u));
//            }}
//
//        list=  listOfWordsInFile.stream().map(w->{
//            List<String> list = new ArrayList<>();
//            IntStream.range(0, words.size()).filter((u) -> words.get(u).equalsIgnoreCase(w))
//                            .forEach(i->list.add(words.get(i)));
//
////list.add(w);
//            return Stream.of(list);
//        }).collect(Collectors.toList());
//        System.out.println(words);
//        System.out.println(list);
//                .map(x->x)
//        treeMap = words.stream().filter(l -> l.length() >= NUMBERGRAPH)
//                .flatMap((x) -> {
//                    List<String> list = new ArrayList<>();
//                    IntStream.range(0, x.length() - (NUMBERGRAPH - 1))
//                            .forEach((u) -> list.add(x.toUpperCase().substring(u, NUMBERGRAPH + u)));
//                    return Stream.of(list);
//                })
//                .collect(Collectors.toList()).stream().flatMap(Collection::stream)
//                .collect(Collectors.groupingBy(key -> key, TreeMap::new, Collectors.counting()));


//
//        System.out.println(lists);
//
//        stringsOne.countingWordsInText(lists);
//        lists.add("spr");
//        stringsOne.countingWordsInText(lists);


    }
}

