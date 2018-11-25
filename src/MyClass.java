import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MyClass  {
    List<String> list;

    public MyClass() {
        this.list = Arrays.asList("AAA", "BBB", "CCC");
    }

public void  print(){
        list.forEach((o)->{o=null;
            System.out.println(o);});
//        list.forEach(System.out::println);
list = list.stream().filter(o->o.contains("A")).collect(Collectors.toList());
    System.out.println(list);
    }


    public String toString(MyFoo f) {
//        list.forEach();
        String tmp = "FFF";
        for (String s : list) {
            tmp +=  f.foo(s);

        }
        return tmp;
    }
}
