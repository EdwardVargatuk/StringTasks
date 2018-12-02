import java.util.stream.IntStream;

//In a given text, a search is performed for a substring of maximum length, which is a palindrome.
public class StringsThreePalindrome {

    private String getLongestPalindromeEven(String input) {
        String[] currentPalindrome = new String[1];
        String[] longestPalindrome = {""};
        IntStream.range(0, input.length()).filter(o -> input.charAt(o) != ' ').forEach(i -> {
            int right = i + 1;
            findPalindromes(input, currentPalindrome, longestPalindrome, i, right);
        });
        return longestPalindrome[0];
    }

    private String getLongestPalindromeOdd(String input) {
        String[] currentPalindrome = new String[1];
        String[] longestPalindrome = {""};
        IntStream.range(0, input.length()).filter(o -> input.charAt(o) != ' ').forEach(i -> {
            int left = i - 1;
            int right = i + 1;
            findPalindromes(input, currentPalindrome, longestPalindrome, left, right);
        });
        return longestPalindrome[0];
    }

    private void findPalindromes(String input, String[] currentPalindrome, String[] longestPalindrome, int left, int right) {
        while (left >= 0 && right < input.length() && input.charAt(left) == input.charAt(right) && input.charAt(left) != ' ') {
            currentPalindrome[0] = input.substring(left, right + 1);
            longestPalindrome[0] = (currentPalindrome[0].length() > longestPalindrome[0].length()) ? currentPalindrome[0] : longestPalindrome[0];
            --left;
            ++right;
        }
    }

    private void determinationMaxPalindrome(String input) {
        String even = getLongestPalindromeEven(input);
        String odd = getLongestPalindromeOdd(input);
        if (even.length() > odd.length()) {
            System.out.println("String: " + "\n" + input + "\n" + "Longest Palindrome: " + "\n" + even);
        } else if (even.length() < odd.length())
            System.out.println("String: " + "\n" + input + "\n" + "Longest Palindrome: " + "\n" + odd);
    }

    public static void main(String[] args) {

        StringsThreePalindrome stringsThreePalindrome = new StringsThreePalindrome();
        String str = "implementation of the Inversion " +
                " of Control (IoC) [1] [principle]. IoC is also known abccbaas dependency injection (DI). It is a process whereby objects define their dependencies, that is, the other objects they work with, only through constructor arguments, arguments to a factory method, or properties that are set on the object instance after it is constructed or returned from a factory method. The container then injects those dependencies when it creates the bean. This process is fundamentally the inverse, hence the name Inversion of Control (IoC), of the bean itself controlling the instantiation or location of its dependencies by using direct construction of classes, or a mechanism such as the Service Locator pattern." +
                "The org.springframework.beans and org.springframework.context packages are the basis for Spring Framework’s IoC container. The BeanFactory interface provides an advanced configuration mechanism capable of managing any type of object. ApplicationContext is a sub-interface of BeanFactory. It adds easier integration with Spring’s AOP features; message resource handling (for use in internationalization), event publication; and application-layer specific contexts such as the WebApplicationContext for use in web applications. In short, the BeanFactory provides the configuration framework and basic functionality, and the ApplicationContext adds more enterprise-specific functionality. The ApplicationContext is a complete superset of the BeanFactory, and is used exclusively in this chapter in descriptions of Spring’s IoC container. For more information on using the BeanFactory instead of the ApplicationContext, refer to The BeanFactory." +
                "In Spring, the objects that form the backbone of your application and that are managed by the Spring IoC container are called beans. A bean is an object that is instantiated, assembled, and otherwise managed by a Spring IoC container. Otherwise, a bean is simply one of many objects in your application. Beans, and the dependencies among them, are reflected in the configuration metadata used by a container.";

        stringsThreePalindrome.determinationMaxPalindrome(str);

    }
}