
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws FileNotFoundException {

  //  Scanner cin = new Scanner(new FileReader("input.txt"));
    Scanner cin = new Scanner(System.in);

    int n = cin.nextInt();
    double[] num = new double[n];
    double sum = 0;
    for (int i=0;i<n;i++) {
      int in = cin.nextInt();
      sum += in;
      num[i] = in;
    }

    double mean = sum / n;
    for (int i = 0;i<n;i++) {
      num[i] = Math.abs(num[i]-mean);
    }
    int pos = 0;
    double min = Integer.MAX_VALUE;
    for (int i=0;i<n;i++) {
      if (num[i]<min) {
        pos = i;
        min = num[i];
      }
    }

    System.out.println(pos);

  }

}