/*https://www.hackerrank.com/challenges/java-generics/problem?isFullScreen=true
Today I chose generics, because I never actually tried this with Java. Other languages like
Python tend to allow this implicitly without explicitly having to define them. 
So I found this as an idea on how to do this.
https://www.tutorialspoint.com/java/java_generics.htm
https://www.baeldung.com/java-store-scanner-input-in-array
https://www.baeldung.com/java-generics

So, I also found the naming conventions on Stack Overflow for refernce.
E - Element (used extensively by the Java Collections Framework)
K - Key
N - Number
T - Type
V - Value
S,U,V etc. - 2nd, 3rd, 4th types
 
*/
import java.io.*;
import java.util.*;

public class Solution {
    
    public static  <E>void printArray(List<E> inputArray){
        for(E element: inputArray){
            System.out.printf("%s \n",element);
        }
    }


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        List<Integer> ints=new ArrayList<>();
        ints.add(1);
        ints.add(2);
        ints.add(3);
        Solution.printArray(ints);
        List<String> strings=new ArrayList<>();
        strings.add("Hello");
        strings.add("World");
        Solution.printArray(strings);
        
    }
}

