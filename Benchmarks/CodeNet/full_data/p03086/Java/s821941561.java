import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
	String sa[] = sc.next().split("");
    int count = 0;
    int max = 0;
    for (Sting s : sa) {
       if ("ACGT".indexOf(s) != -1) {
         count++;
       } else {
         if (count >= max) { 
           max = count;
         }
       }
    }
    System.out.println(ma);
  }
}