import java.io.*;
import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new
        InputStreamReader(System.in));
int a=Integer.parseInt(br.read());
int b=Integer.parseInt(br.read());
int c=Integer.parseInt(br.read());
int d=Integer.parseInt(br.read());


int area=a*b;
int area1=c*d;
 if(area>=area1)
System.out.println(area);
else if(area<area1)
System.out.println(area1);

}}