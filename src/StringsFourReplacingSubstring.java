import java.util.*;

//In a given text, words of a given length are replaced by the specified a substring whose length may not coincide with the length of the word.
public class StringsFourReplacingSubstring {

    private List<String> listOfWordsInFile = new ArrayList<>();

    private int getLengthForReplace() {
        return lengthForReplace;    }

    private int lengthForReplace;

    private void setLengthForReplace(int lengthForReplace) {
        this.lengthForReplace = lengthForReplace;
    }

    private void setForReplace(String forReplace) {
        this.forReplace = forReplace;
    }

    private String forReplace;

    private List<String> getListOfWordsInFile() {
        return listOfWordsInFile;
    }

    private void read(String words) {
        Scanner reader = new Scanner(words);
        while (reader.hasNext()) {
            String str = reader.next().replaceAll("[,.\";:?!\\-+|\\[\\](){}`’']", "");
            listOfWordsInFile.add(str);
        }
    }

    private void replaceAllByLengthOfWord(String text, int lenReplace, String toReplace) {
        read(text);
        StringBuilder strBuilder = new StringBuilder(text);
        System.out.println("Source text:\n" + strBuilder);
        setLengthForReplace(lenReplace);
        setForReplace(toReplace);
        getListOfWordsInFile().stream().filter(x -> x.length() == lengthForReplace && x.length() >= forReplace.length())
                .forEach(i -> strBuilder.replace(strBuilder.indexOf(i), strBuilder.indexOf(i) + forReplace.length(), forReplace));
        getListOfWordsInFile().stream().filter(x -> x.length() == lengthForReplace & x.length() < forReplace.length())
                .forEach(i -> strBuilder.replace(strBuilder.indexOf(i), strBuilder.indexOf(i) + i.length(), forReplace));
        System.out.println("After Replacing substring according with the words length of: " + getLengthForReplace() + "\n" + strBuilder);
    }

    public static void main(String[] args) {
        String text = "IoC is also known as dependency injection (DI). It is a process whereby objects define their dependencies, that is, the other objects they work with, only through constructor arguments, arguments to a factory method, or properties that are set on the object instance after it is constructed or returned from a factory method. The container then injects those dependencies when it creates the bean. This process is fundamentally the inverse, hence the name Inversion of Control (IoC), of the bean itself controlling the instantiation or location of its dependencies by using direct construction of classes, or a mechanism such as the Service Locator pattern." +
                "In Spring, the objects that form the backbone of your application and that are managed by the Spring IoC container are called beans.";
        StringsFourReplacingSubstring stringsFourReplacingSubstring = new StringsFourReplacingSubstring();
        int lenReplace = 7;
        String toReplace = "ABCDE";
        stringsFourReplacingSubstring.replaceAllByLengthOfWord(text, lenReplace, toReplace);
    }
}