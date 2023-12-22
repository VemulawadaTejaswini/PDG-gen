//TAKOYAKI
import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int power[]=new int[n];
    for (int i=0;i<n;i++) {
      power[i]=sc.nextInt();
    }
    int count=0;
    int temp;
    for (int i=0;i<n-1;i++) {
      for (int j=i+1;j<n;j++) {
        temp=power[i]*power[j];
        count=count+temp;
      }
    }
    System.out.println(count);
  }
}
