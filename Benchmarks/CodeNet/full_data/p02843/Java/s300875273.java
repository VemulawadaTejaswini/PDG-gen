import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int wallet = sc.nextInt();

    int shou = wallet/100;
    int shou2 = wallet%100;
    if(shou2%10>=5)
      shou2 -= 5;
    else
      shou++;
    if(shou >= (shou2/5+2))
      System.out.println(1);
    else
      System.out.println(0);
  }
}