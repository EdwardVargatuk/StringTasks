
import java.util.stream.IntStream;

public class StringsThree {
//
//    public String getCurrentPalindrome() {
//        return currentPalindrome;
//    }

//    public String currentPalindrome;
//    public int countPolindr;
//
//    public        String longestPalindromeEven = "";
//public String someaction(String input, int left, int right){
//    String[] currentPalindrome = new String[1];
//    String[] longestPalindromeEven = {""};
//
//    while (left >= 0 && right < input.length()&& input.charAt(left) == input.charAt(right) ) {
//        currentPalindrome[0] = input.substring(left, right + 1);
//        longestPalindromeEven[0] = (currentPalindrome[0].length() > longestPalindromeEven[0].length()) ? currentPalindrome[0] : longestPalindromeEven[0];
//        -- left;
//        ++right;
//    }
//    return longestPalindromeEven[0];
//}

    private String getLongestPalindromeEven(String input) {

//        String str[] = new String[input.length()];;
//        final int[] rightIndex = new int[1];
//        final int[] leftIndex = new int[1];
        String[] currentPalindrome = new String[1];
        String[] longestPalindrome = {""};
        IntStream.range(0,  input.length()).filter(o->input.charAt(o)!=' ').forEach(i->{int left= i; int right=i+1;
            while (left >= 0 && right < input.length()&& input.charAt(left) == input.charAt(right) ) {
                currentPalindrome[0] = input.substring(left, right + 1);
                longestPalindrome[0] = (currentPalindrome[0].length() > longestPalindrome[0].length()) ? currentPalindrome[0] : longestPalindrome[0];
                -- left;
                ++right;
            }
        });
        return longestPalindrome[0];
//        System.out.println(countPolindr);
    }

    private String getLongestPalindromeOdd(String input) {

//        String str[] = new String[input.length()];;
//        final int[] rightIndex = new int[1];
//        final int[] leftIndex = new int[1];
        String[] currentPalindrom = new String[1];
        String[] longestPalindromeOdd = {""};
        IntStream.range(0,  input.length()).filter(o->input.charAt(o)!=' ').forEach(i->{int left= i-1; int right=i+1;
            while (left >= 0 && right < input.length()&& input.charAt(left) == input.charAt(right) ) {
                currentPalindrom[0] = input.substring(left, right + 1);
                longestPalindromeOdd[0] = (currentPalindrom[0].length() > longestPalindromeOdd[0].length()) ? currentPalindrom[0] : longestPalindromeOdd[0];
                -- left;
                ++right;
            }
        });








//        String[] currentPalindrome = new String[1];
//        String[] longestPalindromeOdd = {""};
//        IntStream.range(0,  input.length()).forEach(i->{int left= i-1; int right=i+1;
//            while (left >= 0 && right < input.length()&& input.charAt(left) == input.charAt(right) ) {
//                currentPalindrome[0] = input.substring(left, right + 1);
//                longestPalindromeOdd[0] = (currentPalindrome[0].length() > longestPalindromeOdd[0].length()) ? currentPalindrome[0] : longestPalindromeOdd[0];
//                -- left;
//                ++right;
//            }
//        });










//          for (int centerIndex = 0; centerIndex < input.length() ; ++centerIndex) {
//            leftIndex[0] = centerIndex - 1;
//            rightIndex[0] = centerIndex +1;
//            while (leftIndex[0] >= 0 && rightIndex[0] < input.length()&& input.charAt(leftIndex[0]) == input.charAt(rightIndex[0]) ) {
////                if (input.charAt(leftIndex) != input.charAt(rightIndex)) {
////                    break;
////                }
////                str[leftIndex].equals(str[rightIndex])
//                currentPalindrome[0] = input.substring(leftIndex[0], rightIndex[0] + 1);
////++countPolindr;
//
//                longestPalindromeOdd[0] = (currentPalindrome[0].length() > longestPalindromeOdd[0].length()) ? currentPalindrome[0] : longestPalindromeOdd[0];
//               --leftIndex[0];
//                ++rightIndex[0];
////                System.out.println(currentPalindrome);
////                System.out.println(longestPalindromeOdd);
//            }
//        }
        return longestPalindromeOdd[0];
//        System.out.println(countPolindr);
    }





//private void ma(String input){
//    for (int centerIndex = 0; centerIndex < input.length() ; ++centerIndex) {
//        int rightIndex;
//        int leftIndex;
//
//        leftIndex = centerIndex;
//        rightIndex = centerIndex + 1;
//        while (leftIndex >= 0 && rightIndex < input.length()) {
////            if (input.charAt(leftIndex) != input.charAt(rightIndex)) {
////                break;
////            }
////            longestPalindromeOdd = (currentPalindrome.length() > longestPalindromeOdd.length()) ? currentPalindrome :  longestPalindromeOdd;
////            currentPalindrome = input.substring(leftIndex, rightIndex + 1);
//            ++countPolindr;
//            leftIndex--;
//            rightIndex++;
//        }
//    }
//    System.out.println(countPolindr);
//    }

    public static void main(String[] args)  {

StringsThree stringsThree= new StringsThree();
        String str = "implementation of the Inversion " +
                " of Control (IoC) [1] [principle]. IoC is alsoabba 4444known u5iu as dependency injection (DI). It is a process whereby objects define their dependencies, that is, the other objects they work with, only through constructor arguments, arguments to a factory method, or properties that are set on the object instance after it is constructed or returned from a factory method. The container then injects those dependencies when it creates the bean. This process is fundamentally the inverse, hence the name Inversion of Control (IoC), of the bean itself controlling the instantiation or location of its dependencies by using direct construction of classes, or a mechanism such as the Service Locator pattern." +
                "The org.springframework.beans and org.springframework.context packages are the basis for Spring Framework’s IoC container. The BeanFactory interface provides an advanced configuration mechanism capable of managing any type of object. ApplicationContext is a sub-interface of BeanFactory. It adds easier integration with Spring’s AOP features; message resource handling (for use in internationalization), event publication; and application-layer specific contexts such as the WebApplicationContext for use in web applications. In short, the BeanFactory provides the configuration framework and basic functionality, and the ApplicationContext adds more enterprise-specific functionality. The ApplicationContext is a complete superset of the BeanFactory, and is used exclusively in this chapter in descriptions of Spring’s IoC container. For more information on using the BeanFactory instead of the ApplicationContext, refer to The BeanFactory." +
                "In Spring, the objects that form the backbone of your application and that are managed by the Spring IoC container are called beans. A bean is an object that is instantiated, assembled, and otherwise managed by a Spring IoC container. Otherwise, a bean is simply one of many objects in your application. Beans, and the dependencies among them, are reflected in the configuration metadata used by a container.";

        String longestPali = stringsThree.getLongestPalindromeOdd(str);
        System.out.println("String: " + str);
        System.out.println("Longest Palindrome: " + longestPali);


        String longestPali2 = stringsThree.getLongestPalindromeEven(str);
        System.out.println("String: " + str);
        System.out.println("Longest Palindrome: " + longestPali2);
//        stringsThree.getLongestPalindromeOdd(str);
//
//        System.out.println(stringsThree.getCurrentPalindrome());
//        stringsThree.ma(str);
//        System.out.println(stringsThree.getCurrentPalindrome());


    }



}



//    public static String findLongestPalindrome(String s) {
//        if (s == null || s.length() == 0)
//            return "";
//
//        char[] s2 = addBoundaries(s.toCharArray());
//        int[] p = new int[s2.length];
//        int c = 0, r = 0; // Here the first element in s2 has been processed.
//        int m = 0, n = 0; // The walking indices to compare if two elements are the same
//        for (int i = 1; i < s2.length; i++) {
//            if (i > r) {
//                p[i] = 0;
//                m = i - 1;
//                n = i + 1;
//            } else {
//                int i2 = c * 2 - i;
//                if (p[i2] < (r - i)) {
//                    p[i] = p[i2];
//                    m = -1; // This signals bypassing the while loop below.
//                } else {
//                    p[i] = r - i;
//                    n = r + 1;
//                    m = i * 2 - n;
//                }
//            }
//            while (m >= 0 && n < s2.length && s2[m] == s2[n]) {
//                p[i]++;
//                m--;
//                n++;
//            }
//            if ((i + p[i]) > r) {
//                c = i;
//                r = i + p[i];
//            }
//        }
//        int len = 0;
//        c = 0;
//        for (int i = 1; i < s2.length; i++) {
//            if (len < p[i]) {
//                len = p[i];
//                c = i;
//            }
//        }
//        char[] ss = Arrays.copyOfRange(s2, c - len, c + len + 1);
//        return String.valueOf(removeBoundaries(ss));
//
//    }
//
//    private static char[] addBoundaries(char[] cs) {
//        if (cs == null || cs.length == 0)
//            return "||".toCharArray();
//
//        char[] cs2 = new char[cs.length * 2 + 1];
//        for (int i = 0; i < (cs2.length - 1); i = i + 2) {
//            cs2[i] = '|';
//            cs2[i + 1] = cs[i / 2];
//        }
//        cs2[cs2.length - 1] = '|';
//        return cs2;
//    }
//
//    private static char[] removeBoundaries(char[] cs) {
//        if (cs == null || cs.length < 3)
//            return "".toCharArray();
//
//        char[] cs2 = new char[(cs.length - 1) / 2];
//        for (int i = 0; i < cs2.length; i++) {
//            cs2[i] = cs[i * 2 + 1];
//        }
//        return cs2;
//    }
//
//    public static void main(String[] args) {
//        String str = "implementation of the Inversion " +
//                " of Control (IoC) [1] [principle]. IoC is also known as dependency injection (DI). It is a process whereby objects define their dependencies, that is, the other objects they work with, only through constructor arguments, arguments to a factory method, or properties that are set on the object instance after it is constructed or returned from a factory method. The container then injects those dependencies when it creates the bean. This process is fundamentally the inverse, hence the name Inversion of Control (IoC), of the bean itself controlling the instantiation or location of its dependencies by using direct construction of classes, or a mechanism such as the Service Locator pattern." +
//                "The org.springframework.beans and org.springframework.context packages are the basis for Spring Framework’s IoC container. The BeanFactory interface provides an advanced configuration mechanism capable of managing any type of object. ApplicationContext is a sub-interface of BeanFactory. It adds easier integration with Spring’s AOP features; message resource handling (for use in internationalization), event publication; and application-layer specific contexts such as the WebApplicationContext for use in web applications. In short, the BeanFactory provides the configuration framework and basic functionality, and the ApplicationContext adds more enterprise-specific functionality. The ApplicationContext is a complete superset of the BeanFactory, and is used exclusively in this chapter in descriptions of Spring’s IoC container. For more information on using the BeanFactory instead of the ApplicationContext, refer to The BeanFactory." +
//                "In Spring, the objects that form the backbone of your application and that are managed by the Spring IoC container are called beans. A bean is an object that is instantiated, assembled, and otherwise managed by a Spring IoC container. Otherwise, a bean is simply one of many objects in your application. Beans, and the dependencies among them, are reflected in the configuration metadata used by a container.";
//        StringsThree stringsThree = new StringsThree();
//        System.out.println( StringsThree.findLongestPalindrome(str));
//
//    }