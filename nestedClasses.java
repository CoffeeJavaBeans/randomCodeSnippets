/*
This problem was interesting, not just because it wanted an interface, but because of nested classes.
https://www.hackerrank.com/challenges/java-interface/problem?isFullScreen=true

I realized I had no idea how to instantiate a nexted class! It's one of those small details you don't
really notice to think about until it comes up... https://www.geeksforgeeks.org/nested-classes-java/

The algorithm of finding divisors is easy here, just check if i from 1 to n  n modulo i = 0
and add each of those together.
*/
import java.io.*;
import java.util.*;

public class Solution {
    
    interface AdvancedArithmetic{
       //pubilc int divisor_sum(int n);
       //for some reason it's not allowing interface method
    }
    
    class MyCalculator implements AdvancedArithmetic{
        
        int  divisor_sum(int n){
            int addDivisors=0;
            for(int i=1; i<=n; i++){
                if(n%i == 0){
                    addDivisors+=i;
                }
            }
            System.out.println("I implemented: AdvancedArithmetic");
            return addDivisors;
            
        }
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner= new Scanner(System.in);
        int n= scanner.nextInt();
        Solution s=new Solution();
        Solution.MyCalculator mc= s.new MyCalculator();
        int thesum=mc.divisor_sum(n);
        System.out.println(thesum);
    }
}
