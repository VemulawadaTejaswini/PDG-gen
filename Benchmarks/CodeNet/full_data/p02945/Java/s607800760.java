import java.util.*;

public class Main{

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    int wa = a + b;
    int sa = a - b;
    int seki = a*b;
    int max = wa;

    int[] data = {wa,sa,seki};

    for(int i = 0;i < data.length;i++){
      max = Math.max(data[i],max);
    }

    System.out.println(max);

  }

}
