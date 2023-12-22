import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int data[]={n+m,n-m,n*m};
    int max=n+m;

    for(int i=1;i<data.length;i++){
      // System.out.println(data[i]);
       max=Math.max(data[i],max);
    }
    System.out.println(max);

  }
}
