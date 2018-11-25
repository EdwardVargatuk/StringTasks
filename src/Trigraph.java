import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Trigraph {
public  List<String> listOfGraphs;
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
//    Map<String, Integer>
    private void divideToGraph() {//@NotNull List<String> words
      listOfGraphs = Arrays.asList("ahhhLLh1", "ahh82", "a3", "fuck" ,"bigFUCKahh");
        List<String> listOfGr= new ArrayList<>();
//        for (String strings : words) {
//            if (strings.length() >= NUMBERGRAPH & NUMBERGRAPH > 0)
//                for (int i = 0; i < strings.length() - (NUMBERGRAPH - 1); i++) {
//                    listOfGraphs.add(strings.toUpperCase().substring(i, i + NUMBERGRAPH));
//                }
//        }
        Predicate<String> predicate = (s) -> s.length() >= NUMBERGRAPH;

//        predicate.test("foo");
                Map<String, Long> treeMap = new TreeMap<>();
        List<List<String>> stream;
        stream = listOfGraphs.stream().filter(predicate)
                .flatMap((x)->{

//                    IntStream.range(0,  x.length () - (NUMBERGRAPH - 1))
//                            .forEach(System.out::println);
//                                    value ->
//                            Stream.of(x.toUpperCase().substring(value, value + NUMBERGRAPH)));
                //.forEach(u->
//                            listOfGraphs.add(
//                            x.toUpperCase().substring(0, x + NUMBERGRAPH))
//                                     Stream.of(x, x+" ");
                    List<String>list=new ArrayList<>();
//                                    for (int i = 0; i < x.length() - (NUMBERGRAPH - 1); i++){
                    IntStream.range(0,  x.length () - (NUMBERGRAPH - 1))
                            .forEach((u)-> list.addAll(Collections.singleton(x.toUpperCase()
                                    .substring(u, NUMBERGRAPH + u))));




                    return Stream.of(list);
//                          x.toUpperCase().substring(0, NUMBERGRAPH));
                })
                .collect(Collectors.toList());
//                .forEach(x->{List<String> ll = new ArrayList<>();
//        ll= stream.stream().flatMap(c->c.stream()).collect(Collectors.toList());});
        System.out.println(stream);
        List<String> ll = new ArrayList<>();

//        Map<String, Integer> finalTreeMap = treeMap;
        treeMap = stream.stream().flatMap(Collection::stream)
                .collect(Collectors.groupingBy(key->key,


                            Collectors.counting()));
//                            Integer value = stream.get(i);
//                            return
//                    i==null ? 1:value+1;}));




//        count = treeMap.get(strFromListOfGraph);
//        treeMap.put(strFromListOfGraph, count == null ? 1 : count + 1);
        System.out.println(treeMap);
//        List<String> ll = stream.collect(
//                ArrayList::new,
//                ArrayList::addAll,
//                ArrayList::addAll
//        );;

//        stream.stream().forEach(x->ll.add(x.spliterator()));
//       stream.stream().map(x->x.spliterator()).forEach(System.out::println);


//        List<String> listOfWordsInFile = new ArrayList<>();
//        Scanner reader = new Scanner(String.valueOf(stream));
//        while (reader.hasNext()) {
//            String str = reader.next();
//            listOfWordsInFile.add(str);}
//            System.out.println(listOfWordsInFile);

//        new ArrayList<>(stream).forEach(System.out::println);
// stream.stream()
//        .collect(Collectors.toMap(
//                Function.identity(),
//                Function.identity()
//        )).entrySet().forEach(System.out::println);
//treeMap.entrySet().forEach(System.out::println);


//
//        Map<String, Integer> treeMap = new TreeMap<>();
//        Integer count;
//        for (String strFromListOfGraph : listOfGraphs) {
//            count = treeMap.get(strFromListOfGraph);
//            treeMap.put(strFromListOfGraph, count == null ? 1 : count + 1);
//        }
//        return treeMap;
    }

    public static void main(String[] args) {
        File file = new File("src/test.txt");
        Trigraph trigraph = new Trigraph();
       trigraph.divideToGraph();
//        Map<String, Integer> treeMap = trigraph.divideToGraph(trigraph.read(file));
//        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
//            String key = entry.getKey();
//            Integer value = entry.getValue();
//            System.out.println(key + " = " + value);
//        }

//        System.out.println(trigraph.divideToGraph(trigraph.read(file)));
    }
}

