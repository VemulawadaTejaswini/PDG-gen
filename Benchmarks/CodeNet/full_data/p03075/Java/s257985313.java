import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int abcde[]=new int[5];
    for (int i=0;i<5;i++) {
      abcde[i]=sc.nextInt();
    }
    int k=sc.nextInt();
    int count=0;

    for (int i=0;i<4;i++) {
      for (int j=i+1;j<5;j++) {
        int ans=Math.abs(abcde[i]-abcde[j]);
        if (ans>k) {
          count++;
        }
      }
    }

    if (count>0) {
      System.out.println(":(");
    }else{
      System.out.println("Yay!");
    }
  }
}
