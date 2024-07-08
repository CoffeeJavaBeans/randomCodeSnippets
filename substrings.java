/* Hackerrank problem https://www.hackerrank.com/challenges/java-string-compare/problem?isFullScreen=true  
First I tried Set<String> words=new TreeSet<>(); to have a sorted set, but then upon doing this, I learned
Set doesn't have a get method. Oops! Okay, so maybe I will try to use List<String> words=new ArrayList<>();
and use Collections.sort(words);

*/

import java.io.*;
import java.util.*;

public class Solution {
    
    public void solution(String s, int k){
        List<String> words=new ArrayList<>();
        for(int i=0; i<s.length()-k+1; i++){
            String t=s.substring(i,i+k);
            words.add(t);
        }
        Collections.sort(words);
        String w1=words.get(0);
        String w2=words.get(words.size()-1);
        System.out.println(w1);
        System.out.println(w2);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.next();
        int k=scanner.nextInt();
        Solution sol=new Solution();
        sol.solution(s,k);
        
    }
}

