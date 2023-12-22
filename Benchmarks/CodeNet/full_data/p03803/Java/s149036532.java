import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int s1 = sc.nextInt();
   int s3 = sc.nextInt();
   
   if(s1==s3)System.out.println("Draw");
   else if(s1==1)System.out.println("Alice");
   else if(s3==1)System.out.println("Bob");
   else if(s1>s3)System.out.println("Alice");
   else if(s3<s1)System.out.println("Bob");
 }
}