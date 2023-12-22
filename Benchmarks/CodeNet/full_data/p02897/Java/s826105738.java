import java.util.*;

public class Main{

public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  double N = sc.nextDouble();
  System.out.println((N - Math.floor(N/2)) / N);
}
}