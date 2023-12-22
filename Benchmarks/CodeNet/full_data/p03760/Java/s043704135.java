import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    String o = sc.next();
    String e = sc.next();

    sc.close();

    String[] O = o.split("");
    String[] E = e.split("");

    int count = O.length + E.length;

    int i = 0;

    while (i < count) {
      if (i % 2 == 0){
        System.out.print(O[i/2]);
      } else {
        System.out.print(E[i/2]);
      }
      i++;
    }

    System.out.println("");

  }

}