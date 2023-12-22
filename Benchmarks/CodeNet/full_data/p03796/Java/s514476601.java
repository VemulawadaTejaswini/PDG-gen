import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    sc.close();
    long power=1;
    for(int i=0;i<n;i++){
      power*=(i+1);
      power%=(Math.pow(10,9)+7);
    }
    System.out.println(power);
  }
}