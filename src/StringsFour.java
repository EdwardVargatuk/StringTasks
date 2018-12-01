import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringsFour {
    private List<String> listOfWordsInFile = new ArrayList<>();
    private Map<String, Long> treeMap;


    private List<String> getListOfWordsInFile() {
        return listOfWordsInFile;
    }

    private Map<String, Long> getTreeMap() {
        return treeMap;
    }

    private void read(String words) {
        Scanner reader = new Scanner(words);
        while (reader.hasNext()) {
            String str = reader.next().replaceAll("[,.\";:?!\\-+|\\[\\](){}`’']", "");
            listOfWordsInFile.add(str);
        }

    }

    private void tееt(String text) {
        read(text);
List<String> maxSize = new ArrayList<>();
        String str = "abc";
        final Comparator<String> comp = Comparator.comparingInt(String::length);
        List<String> one = new ArrayList<>();
        List<String> two = new ArrayList<>();
Map<String, String> sss = new TreeMap<>();
       one= listOfWordsInFile.stream().filter(i->i.length()==7).collect(Collectors.toList());

        StringBuilder txt = new StringBuilder("In Spring, the objects that form the dddbackbone of your application and that are managed by the Spring IoC container are called beans. ");
        System.out.println(txt);

        int lengthForReplace=11;
     String forReplace = "ABCDE";
        for (String st:
                listOfWordsInFile
             ) {
            if (st.length()==lengthForReplace && st.length()>=forReplace.length()){
                txt.replace(txt.indexOf(st), txt.indexOf(st)+forReplace.length(), forReplace);
            }else if (st.length()==lengthForReplace && st.length()<forReplace.length())
                txt.replace(txt.indexOf(st), txt.indexOf(st)+st.length(), forReplace);
//                txt.insert(txt.indexOf(st), forReplace+" ");
//                txt.replace(txt.indexOf(st), txt.indexOf(st)+forReplace.length(), forReplace+" ");
        }

        System.out.println(txt);

        two = listOfWordsInFile.stream().filter(i->i.length()==7).map(x->x.replace(x.substring(0,str.length()),str)).collect(Collectors.toList());


//        .collect(Collectors.toMap(key->key, value->listOfWordsInFile.stream().filter(i->i.length()==6).map(x->x.replaceAll(x.substring(0,str.length()),str)).collect(Collectors.toList())));
//                .forEach(x->        maxSize.add(x));
//        String txt = "In Spring, the objects that form the dddbackbone of your application and that are managed by the Spring IoC container are called beans. ";
       StringBuilder string;
//      maxSize.stream().map(x->txt.replace("called", x)) .forEach(System.out::println);
      sss= IntStream.range(0, one.size())
              .boxed().collect(Collectors.toMap(one::get, two::get));
        System.out.println(sss);
        String[] replacements= one.toArray(new String[0]);
        String[] replac= two.toArray(new String[0]);
        String[] rep=one.stream().toArray(String[]::new);

//        sss.entrySet().stream().forEach(x-);



//        System.out.println(txt);
//        for (String f: maxSize
//             ) {
//
//
//if(f.contains(txt))
//    txt.replaceAll(f)
//
//        }
        System.out.println(maxSize);
//        System.out.println(listOfWordsInFile);

//        System.out.println(listOfWordsInFile.stream().max(comp).get());
        List<String> result = new ArrayList<>();
        Map<Integer, String> someMap = new LinkedHashMap<>();
        String chars = "d";
        Pattern p = Pattern.compile(chars, Pattern.CASE_INSENSITIVE);
        int matches = 0;


        System.out.println(someMap);
//        System.out.println( listOfWordsInFile.stream().filter(i->.contains(chars)));

    }

    public static void main(String[] args) {
        String text = "In Spring, the objects that form the dddbackbone of your application and that are managed by the Spring IoC container are called beans. ";
        StringsFour stringsFour = new StringsFour();
        CharSequence chars = "s";
stringsFour.tееt(text);



    }
}
