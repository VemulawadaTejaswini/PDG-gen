import java.io.*;
import java.util.*;

class Main
{
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String b = sc.next();
    
    if(b == "A"){
    	System.out.println("T");
    } else if(b == "T"){
    	System.out.println("A");
    } else if(b == "G"){
    	System.out.println("C");
    } else if(b == "C"){
    	System.out.println("G");
    }
  }
}
