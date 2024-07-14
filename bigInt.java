/*
Some big ints https://www.hackerrank.com/challenges/java-biginteger/problem?isFullScreen=true
Found this https://www.geeksforgeeks.org/biginteger-class-in-java/
https://docs.oracle.com/javase/8/docs/api/java/math/BigInteger.html
  */
import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {
    
    public BigInteger add(String A, String B){
        
        BigInteger bi= BigInteger.ZERO;
        BigInteger a= new BigInteger(A);
        BigInteger b= new BigInteger(B);
        bi=a.add(b);
        return bi;
    }
    
    public BigInteger multiply(String A, String B){
        
        BigInteger bi= BigInteger.ZERO;
        BigInteger a= new BigInteger(A);
        BigInteger b= new BigInteger(B);
        bi=a.multiply(b);
        return bi;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner=new Scanner(System.in);
        String A = scanner.nextLine();
        String B = scanner.nextLine();
        Solution s = new Solution();
        BigInteger ansa= s.add(A,B);
        System.out.println(ansa);
        BigInteger ansm= s.multiply(A,B);
        System.out.println(ansm);
    }
}
