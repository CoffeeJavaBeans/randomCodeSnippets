//Hackerrank problem https://www.hackerrank.com/challenges/java-list/problem
/*
This problem needs to read input from a user and use a list in Java. The choices I found that could be used
would be Scanner, and BufferedReader. I chose Scanner because it is more familiar with me, so might as well
also give documentation a read while I'm here. :)
*/
///////////// https://docs.oracle.com/javase%2F7%2Fdocs%2Fapi%2F/java/util/Scanner.html
//Using Scanner
import java.io.*;
import java.util.*;

public class Solution {
    public void solution(){
        Scanner scanner = new Scanner(System.in);
        int howMany=scanner.nextInt();
        List<Integer> theList=new ArrayList<>();
        for(int i= 0; i<howMany; i++){
            int n = scanner.nextInt();
            theList.add(n);
        }
        int howMany2=scanner.nextInt();
        for(int i=0; i<howMany2; i++){
            String input1=scanner.next().trim().toLowerCase();
                if(input1.equals("insert")){
                    int ind=scanner.nextInt();
                    int num=scanner.nextInt();
                    theList.add(ind,num);
                }
                if(input1.equals("delete")){
                    int ind=scanner.nextInt();
                    theList.remove(ind);
                }
            }
        scanner.close();
        String ltoString=theList.toString();
        ltoString=ltoString.replace("[","");
        ltoString=ltoString.replace("]","");
        ltoString=ltoString.replace(",", "");
        System.out.println(ltoString);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Solution s= new Solution();
        s.solution();
    }
}
