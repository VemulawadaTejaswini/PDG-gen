import java.util.*;
import java.lang.*;
import java.io.*;
public class Main {
    public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
        int i,flag=0;
        int[] count=new int[26];
        String s1=sc.next();
       
        char[] arr=s1.toCharArray();
        for(i=0;i<arr.length;i++){
            count[arr[i]-'A']++;
        }
        for(int n:count){
            if(n==2){
                flag=1;
               }
               else if(n==1){
                   flag=0;
               }
        }
        if(flag==1)
         System.out.println("YES");
         else
         System.out.println("NO");
}

}