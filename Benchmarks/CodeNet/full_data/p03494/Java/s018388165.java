import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int a = Integer.parseInt(scanner.next());
    int[] b = new int [a];
    int count = 0;
    
    for(int i = 0; i < a; i++){
      b[i] = Integer.parseInt(scanner.next());
    }

    loop: for(count = 0; ; count++){
      for(int j = 0; j < a; j++){
        if(b[j] % 2 == 1){
          break loop;
        }
        b[j] /= 2;
      }
    }
    System.out.println(count);
    scanner.close();
  }
}