import java.util.*;
import java.io.*;
class GFG{
   
public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
    int h=sc.nextInt();
    int w=sc.nextInt();
    int n=sc.nextInt();
    System.out.println((int)Math.min((int)Math.ceil((double)n/h),(int)Math.ceil((double)n/w)));
}
}
