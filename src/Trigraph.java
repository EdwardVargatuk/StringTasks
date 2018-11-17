import java.io.File;
import java.io.IOException;
import java.util.*;

public class Trigraph {

   private static final int TRIGRAPH = 3;
//    private List<String> listOfWordsInFile = new ArrayList<>();
//    private List<String> listOfTrigraphs = new ArrayList<>();


//    private List<String> divideToTrigraph(String strings) {
//        int lenOfStr = strings.length();
//        List<String> listOfTrigraphInStr = new ArrayList<>();
//        for (int i = 0; i < lenOfStr - 2; i++) {
//            listOfTrigraphInStr.add(strings.toUpperCase().substring(i, i + 3));
//        }
//        return listOfTrigraphInStr;
//    }

    private List<String> read(File file) {
        List<String> listOfWordsInFile = new ArrayList<>();
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNext()) {
                String str = reader.next().replaceAll("[,.\";:?!\\-+|\\[\\](){}`’']", "");
//                String result = str.replaceAll("[,.\";:?!\\-+|\\[\\](){}`’']", "");
                listOfWordsInFile.add(str);
            }
        } catch (IOException e) {
            System.out.println("Error reading file named '" + "'");
        }
        return listOfWordsInFile;
    }

    private void divideToTrigraph(List<String> words) {
//        List<String> listOfTrigraphs = new ArrayList<>();
        List<String> listOfTrigraphs = new ArrayList<>();
        for (String strings : words) {
            if (strings.length() >= TRIGRAPH)
                for (int i = 0; i < strings.length() - (TRIGRAPH-1); i++) {
                    listOfTrigraphs.add(strings.toUpperCase().substring(i, i + TRIGRAPH));
                }
//            listOfTrigraphs.addAll(listOfTrigraphs);

        }
                System.out.println(words);
        System.out.println(listOfTrigraphs);

        Map<String, Integer> treeMap = new TreeMap<>();
        Integer count;
        for (String strFromListOfTrigraph : listOfTrigraphs) {
            count = treeMap.get(strFromListOfTrigraph);
            treeMap.put(strFromListOfTrigraph, count == null ? 1 : count + 1);
        }

        System.out.println(treeMap);
//        System.out.println(listOfTrigraphs);
    }

    public static void main(String[] args)  {
        String sss = "The";


        List<String> newlist = new ArrayList<>();


        File file = new File("src/test.txt");


        Trigraph trigraph = new Trigraph();


        newlist.add(sss);
        newlist.add("CoFuck");
        newlist.add("Someword");
        newlist.add("Co]");
        trigraph.divideToTrigraph(newlist);
trigraph.divideToTrigraph(trigraph.read(file));
//
//        newlist.sort(Comparator.naturalOrder());
//        System.out.println(newlist);


//        Map<String, Integer> treeMap = new TreeMap<>();
//        Integer count;
//        for (String strFromNewlist : newlist) {
//            count = treeMap.get(strFromNewlist);
//            treeMap.put(strFromNewlist, count == null ? 1 : count + 1);
//
//        }
//
//        System.out.println(treeMap);


        //        System.out.println(  trigraph.read("D:\\JDK\\TEMP\\test.txt"));
//listOfTrigraph.add(trigraph.read("D:\\JDK\\TEMP\\test.txt"));
//        System.out.println(listOfTrigraph);

//        String fname;
//        Scanner scan = new Scanner(trigraph.read("D:\\JDK\\TEMP\\test.txt"));
//
//        fname = scan.next();
//        System.out.println();


//        try
//        {
//            /* FileReader reads text files in the default encoding */
//            FileReader fileReader = new FileReader("D:\\JDK\\TEMP\\test.txt");
//int c;
//
//            /* always wrap the FileReader in BufferedReader */
////            BufferedReader bufferedReader = new BufferedReader(fileReader);
//
//            while((c = fileReader.read()) != -1)
////            {
////                System.out.println(word);
////            }
//
//            {
//                listOfTrigraph.add(String.valueOf(c));
//                System.out.println(listOfTrigraph);
//            }
//
//
//
//            /* always close the file after use */
////            bufferedReader.close();
        //        }
//        catch(IOException ex)
//        {
//            System.out.println("Error reading file named '" + "'");
//        }


    }

}
