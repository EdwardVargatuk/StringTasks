import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringsTwo {
    private List<String> listOfWordsInFile = new ArrayList<>();

    private static void setChars(String chars) {
        StringsTwo.chars = chars;
    }
    private static String chars;

    private void read(String words) {
        Scanner reader = new Scanner(words);
        while (reader.hasNext()) {
            String str = reader.next().replaceAll("[,.\";:?!\\-+|\\[\\](){}`’']", "");
            listOfWordsInFile.add(str);
        }
    }

    private static int getMatches(String strings) {
        Pattern p = Pattern.compile(chars, Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(strings);
        int counter = 0;
        while (m.find()) {
            counter++;
        }
        return counter;
    }

    private void createSortedLists() {
        List<String> foundChar;
        List<String> notFoundChar;

        foundChar = listOfWordsInFile.stream().filter(y -> y.toLowerCase().contains(chars.toLowerCase()))
                .sorted(Comparator.comparing(StringsTwo::getMatches).reversed().thenComparing(Comparator.naturalOrder())).collect(Collectors.toList());
        notFoundChar = listOfWordsInFile.stream().filter(y -> !y.toLowerCase().contains(chars.toLowerCase()))
                .sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        Stream.concat(foundChar.stream(), notFoundChar.stream()).collect(Collectors.toList()).forEach(System.out::println);
    }

    private void sortByNumberOfEntriesChar(String text, String chars) {
        listOfWordsInFile.clear();
        read(text);
        setChars(chars);
        createSortedLists();
    }

    public static void main(String[] args) {
        String text = "This \"chapter\" covers the Spring Framework\n" +
                "implementation of the Inversion\n" +
                "of Control (IoC) [1] [principle]. IoC is also known as dependency injection (DI). It is a process whereby objects define their dependencies, that is, the other objects they work with, only through constructor arguments, arguments to a factory method, or properties that are set on the object instance after it is constructed or returned from a factory method. The container then injects those dependencies when it creates the bean. This process is fundamentally the inverse, hence the name Inversion of Control (IoC), of the bean itself controlling the instantiation or location of its dependencies by using direct construction of classes, or a mechanism such as the Service Locator pattern.\n" +
                "The org.springframework.beans and org.springframework.context packages are the basis for Spring Framework’s IoC container. The BeanFactory interface provides an advanced configuration mechanism capable of managing any type of object. ApplicationContext is a sub-interface of BeanFactory. It adds easier integration with Spring’s AOP features; message resource handling (for use in internationalization), event publication; and application-layer specific contexts such as the WebApplicationContext for use in web applications. In short, the BeanFactory provides the configuration framework and basic functionality, and the ApplicationContext adds more enterprise-specific functionality. The ApplicationContext is a complete superset of the BeanFactory, and is used exclusively in this chapter in descriptions of Spring’s IoC container. For more information on using the BeanFactory instead of the ApplicationContext, refer to The BeanFactory.\n" +
                "In Spring, the objects that form the backbone of your application and that are managed by the Spring IoC container are called beans. A bean is an object that is instantiated, assembled, and otherwise managed by a Spring IoC container. Otherwise, a bean is simply one of many objects in your application. Beans, and the dependencies among them, are reflected in the configuration metadata used by a container.";
        String charToSortBy = "e";
        StringsTwo stringsTwo = new StringsTwo();
        stringsTwo.sortByNumberOfEntriesChar(text, charToSortBy);
    }
}


//           }));
//    forEach(nested -> words.stream().distinct().filter(nested::equalsIgnoreCase).forEach(list::add))filter(x->{
//                    Matcher m = p.matcher(x);
//                    return m.find();
//                }).count();
//        System.out.println(f);


//        int matches = 0;
//        for (String words : listOfWordsInFile) {
//
//            Matcher m = p.matcher(words);
//
//
//         if (  m.find()){
//            matches++;
//
//            someMap.put(matches, words);}
//        }

//        System.out.println(someMap);
//            System.out.println(matches + " match(es) found in "+words);


//        System.out.println( listOfWordsInFile.stream().filter(i->.contains(chars)));