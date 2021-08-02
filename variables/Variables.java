
import java.util.Arrays;
import java.util.ArrayList;


public class Variables {
    public static void main(String[] args){
        int ourInt;
        ourInt = 400;
        double pi = 3.14159265;
        boolean bool = true;
        char singleCharacter = 'A';

        // class based vars
        String multipleCharacters = "ABC";
        Integer num = 12314654;

        // arrays
        int[] nums = {214, 254, 54};
        System.out.println(Arrays.toString(nums));

        boolean[] votes = {true, false, true};
        int[] someArr = new int[10];
        System.out.println(Arrays.toString(someArr));
        someArr[0] = 10;
        someArr[3] = 33;

        System.out.println(Arrays.toString(someArr));
        // ArrayList
        ArrayList<Integer> myCoolArr = new ArrayList<Integer>();
        System.out.println(myCoolArr);
        System.out.println( );

        // import outside test file- instantiate and invoke
        VariableTestFile x = new VariablesTest();
        x.sayHello();
    }
}