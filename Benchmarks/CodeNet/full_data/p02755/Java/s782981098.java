
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws FileNotFoundException {

//  Scanner cin = new Scanner(new FileReader("input.txt"));
    Scanner cin = new Scanner(System.in);
    int a = cin.nextInt();
    int b = cin.nextInt();
    int min = b*10;
    int max = (b+1)*10;
    for (int i=min;i<max;i++) {
      // System.out.println((int)i*0.08);
      if (Math.floor(i*0.08)==a){
        System.out.println(i);
        return;
      }
    }
    System.out.println(-1);
  }

}