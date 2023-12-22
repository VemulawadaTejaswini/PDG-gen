import java.util.*;

public class Main {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int n = Integer.parseInt(String.valueOf(scan.nextLine()));

    int total = 0;

    for (int i = 0; i < n; i++){
      total += Integer.parseInt(scan.nextLine());
    }

    if (total % 10 == 0){
      System.out.println(0);
    }
    else{
      System.out.println(total);
    }



  }

}
