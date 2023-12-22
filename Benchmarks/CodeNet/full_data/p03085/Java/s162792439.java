import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    while (in.hasNext()) {
      char gene = in.next().charAt(0);
      char pair = ' ';

      switch(gene) {
        case 'A':
          pair = 'T';
          break;
        case 'C':
          pair = 'G';
          break;
        case 'G':
          pair = 'C';
          break;
        case 'T':
          pair = 'A';
          break;
      }

      System.out.println(pair);
    }
  }
}