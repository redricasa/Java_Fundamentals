// add your Class name
public class FizzBuzz {;
// change according to if it is a test file or main file
    public String fizzBuzz(int number){
        // if / else if/ else
        if( (number % 3 == 0) & (number % 5 == 0)){
            return "FizzBuzz";
        }else if(number % 5 == 0 ){
            return "Buzz";
        }else if(number % 3 == 0){
            return "Fizz";
        }else{
            // string cast int -> string using string method
            return String.valueOf(number);
        }
        // return " ";
    }
}