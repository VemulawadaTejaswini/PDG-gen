import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a = input.nextInt();
    int b = input.nextInt();
    int c = input.nextInt();
    
    int remain = a - b;
    
    int result = c - remain;
    
    System.out.println(result);

  }



}


