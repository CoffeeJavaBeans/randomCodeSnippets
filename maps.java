/* https://www.hackerrank.com/challenges/phone-book/problem?isFullScreen=true
Just a quick map propblem in Java!
The thing that was a small challenge eas that when I did .nextInt, I forgot that the scanner didn't go to the next line
so there was a little error for a bit there, but fixed it.

*/

import java.io.*;
import java.util.*;

public class Solution {
    
    public void solution(){
        Scanner scanner= new Scanner(System.in);
        Map<String,String> mp=new HashMap<>();
        int in=scanner.nextInt();
        scanner.nextLine();
        for(int i=0; i<in; i++){
            String str=scanner.nextLine().trim();
            String str2=scanner.nextLine().trim();
            mp.put(str,str2);
        }
        //System.out.println(mp);
        for(int i =0; i<in; i++){
            String str3=scanner.nextLine().trim();
            //System.out.println(str3);
            if(mp.containsKey(str3)){
                String str4=mp.get(str3);
                System.out.println(str3+"="+str4);
            }else{
                System.out.println("Not found");
            }
            
        }
        
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Solution s= new Solution();
        s.solution();
    }
}
