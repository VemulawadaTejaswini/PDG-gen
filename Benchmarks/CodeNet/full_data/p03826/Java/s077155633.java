import java.io.*;
import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
         int a=sc.nextInt();
         int b=sc.nextInt();
         int c=sc.nextInt();
         int d=sc.nextInt();
         


int area=a*b;
int area1=c*d;
 if(area>=area1)
System.out.println(area);
else if(area<area1)
System.out.println(area1);

}}