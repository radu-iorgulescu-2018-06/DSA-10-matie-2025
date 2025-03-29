package 01JavaBasics;

public class FizzBuzzWStreams {

    public static void calculateWithStreams() {
        IntStreams.rangeClosed(startInclusive:1, endInclusive:100)
        .mapToObject(number -> 
        (number %15 == 0) ? "FizzBuzz"
        : (number %3 == 0)? "Fizz"
        : (number %5 == 0)? "Buzz" 
        : String.valueOf(number))
        .forEach(System.out::println);
    }

    public static void main(String[] args) {
        
    }
    
}