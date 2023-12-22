import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{
public static void main(String[] args) throws FileNotFoundException, IOException{
       Scanner s=new Scanner(System.in);
      String x="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
      int n=s.nextInt();s.nextLine();
     String ss=s.nextLine();
     StringBuilder sb=new StringBuilder();
     for(int i=0;i<ss.length();i++){
      int z=ss.charAt(i)-'A';
      
      z=(z+n)%26;
     // System.out.println(z);
      sb.append(x.charAt(z));
     }
        System.out.println(sb);
        }
    }
