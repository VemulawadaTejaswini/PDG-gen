import java.util.*;
public class Main {

 public static void main(String[] args) {
  Scanner no=new Scanner(System.in);
  int n=no.nextInt();
  int sum=0;
  int ans=0;
  int i=1;
  while(sum<n){
    ans++;
    sum=sum+i;
    i++;
  }
  System.out.println(ans);
 }

}
