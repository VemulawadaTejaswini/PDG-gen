import java.io.BufferedReader;
import java.io.InputStreamReader;
 
//import for Scanner and other utility classes
import java.util.*;
 
class TestClass {
    public static void main(String args[] ) throws Exception {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
       	String st[]=name.split(" ");
      	int a=Integer.parseInt(st[0]);
      	int b=Integer.parseInt(st[1]);
      	if(a<=5){
          System.out.println(0);
        }
      	else if(a>=6 && a<=12){
          System.out.println(b/2);
        }
      	else if(a>=12){
          System.out.println(b);
        }
 
    }
}