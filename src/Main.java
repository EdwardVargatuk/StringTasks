import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
////        String s1 = myClass.toString(s -> s + "->");
//        myClass.print();

        Random random = new Random();
        List<Integer>list= Arrays.asList(2,4,1,5,32,2,5);
        Stream<Integer> stream = list.stream()
//        Stream<Integer> stream = Stream.generate(()->random.nextInt()%10)
//                .peek((o)->System.out.print("1 "+o+"*"))
                .limit(5)
                .peek((o)->System.out.print("1 "+o+"*"))
                .sorted()
                .peek((o)->System.out.print("2 "+o+"*"));
         list = stream.collect(Collectors.toList());
        System.out.println("\n"+list);


        MyFooImpl myFoo = new MyFooImpl();
        String s1 = myClass.toString(myFoo);
        //or
//        myClass.;
//                String s2 = myClass.toString(String s)->{return null;}
//    }

}}

//}
//new MyFoo() {
//@Override
//public String foo(String s) {
//        return s+ "->";
//        }
//        });
//
//        }