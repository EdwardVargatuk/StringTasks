import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Trigraph {


private List<String> getTh(String strings){
    int len = strings.length();

    List<String> tr = new ArrayList<>();
    for (int i = 0; i < len-2; i++) {

    String row = strings.toUpperCase().substring(i, i + 3);

    tr.add(row);

    }
//    System.out.println(tr);
    return tr;
}

    public String read(String file) throws IOException {
        return new String(Files.readAllBytes(Paths.get(file)));
    }

    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();

        Trigraph trigraph = new Trigraph();
        String sss = "The";
        List<String> newlist = new ArrayList<>();

//        System.out.println(  trigraph.read("D:\\JDK\\TEMP\\test.txt"));
//list.add(trigraph.read("D:\\JDK\\TEMP\\test.txt"));
//        System.out.println(list);

//        String fname;
//        Scanner scan = new Scanner(trigraph.read("D:\\JDK\\TEMP\\test.txt"));
//
//        fname = scan.next();
//        System.out.println();


File file = new File("src/test.txt");
        Scanner reader = new Scanner(file);
//

//        System.out.println(reader.nextLine());
        while  (reader.hasNext()) {
            String str = reader.next();
            String result = str.replaceAll("[,.\";:?!\\-+|\\[\\](){}']","");
//        for (int i = 0; i < str.length(); i++) {
//                for (int j = 0; j < c.length; j++) {
//                    if (str.charAt(i) == c[j]) {
//                        str.replace(c[j], "");
//                        list.remove(str.length());

             list.add(result);


        }
        for (String list11:list) {
            if (list11.length()>=3)

            newlist.addAll(trigraph.getTh(list11));

        }
        System.out.println(list);
        System.out.println(newlist);
        newlist.sort(Comparator.naturalOrder());
        System.out.println(newlist);




        Map<String, Integer> treeMap = new TreeMap<>();
        Integer count;
        for (String strFromNewlist : newlist) {
            count = treeMap.get(strFromNewlist);
            treeMap.put(strFromNewlist, count == null ? 1 : count + 1);

        }

        System.out.println(treeMap);


//        Map<String, Integer> treeMap
//                = new TreeMap<>();
//        treeMap.put( "Smith", 30);
//        treeMap.put( "Smith" , 31);
//        treeMap.put( "Lewis", 29);
//        treeMap.put( "Cook", 29);
//        System.out.println("Display entries in HashMap" );
//        System.out.println(treeMap);

//        String word = null;





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
//                list.add(String.valueOf(c));
//                System.out.println(list);
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
