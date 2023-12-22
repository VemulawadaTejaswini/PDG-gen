//Resisotrs in Parallel
import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    double data[]=new double[1000];

    for (int i=0;i<n;i++) {
      data[i]=sc.nextDouble();
    }

    /*for (int i=0;i<n;i++) {
      System.out.println(data[i]);
    }*/

    double oki=0;

    for (int i=0;i<n;i++) {
      oki=oki+(1.0/data[i]);
    }

    System.out.println(1.0/oki);

  }
}
