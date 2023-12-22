import java.util.*;

public class Main{

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    String chaineNombre = scan.nextLine();

    String[] numberString = chaineNombre.split(" ");

    double a = Double.parseDouble(numberString[0]);
    double b = Double.parseDouble(numberString[1]);
    double x = Double.parseDouble(numberString[2]);

    double compteur = 0;

    while (a <= b){

      if (a % x == 0){
        compteur++;
      }

      a++;
    }

    System.out.println(compteur);

  }


}
