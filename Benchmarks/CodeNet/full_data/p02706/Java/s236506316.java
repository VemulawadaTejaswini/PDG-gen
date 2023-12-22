import java.util.*;
import java.lang.*;

public class Main{

  public static void main(String args[]){
  
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
int sum=0;
    while(m--!=0){
int a = sc.nextInt();
sum+=a;
}
if(sum>n) System.out.println(-1);
else {
System.out.println(n-sum);
}
  }

}