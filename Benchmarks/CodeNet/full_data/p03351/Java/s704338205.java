import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Main {

  
private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
       
        String[] arrItems = scan.nextLine().split(" ");

             int a = Long.parseLong(arrItems[0].trim());
             int b = Long.parseLong(arrItems[1].trim());
             int c = Long.parseLong(arrItems[2].trim());
             int d = Long.parseLong(arrItems[3].trim());
          
             if((Math.abs(a-c)<=d)||(Math.abs(a-b)<=d && Math.abs(b-c)<=d)){
                      System.out.println("Yes");
                   }
             else{
                         System.out.println("No");
                   }
        

    }
}