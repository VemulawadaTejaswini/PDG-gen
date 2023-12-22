import java.util.Scanner;
 
public class Main { //クラス名はMain
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String n = scan.next();
    String d = scan.next();
    int N = Integer.parseInt(n);
    int D = Integer.parseInt(d);
    
    D = 2*(D+1);
    
    int count = N/D + 1;
      
    System.out.println(count);
 
 
    }
}