import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String b = scan.next();
    if(b == "A"){
    	System.out.print("T");
    }
    else if(b == "T"){
      	System.out.print("A");
    }
    else if(b == "G"){
    	System.out.print("C");
    }
    else {
    	System.out.print("G");
    }
    scan.close();
  }
}
  
  
  