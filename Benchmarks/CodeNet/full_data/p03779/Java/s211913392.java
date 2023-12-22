import java.util.*;
public class Main {

 public static void main(String[] args) {
  Scanner no=new Scanner(System.in);
  int n=no.nextInt();
  int sum=0;
  for(int i=0;i<=1000000000;i++){
    sum=sum+i;
    if(sum==n){
      System.out.println(i);
      break;
    }
    else if(sum>n){
      sum=sum-(i+(i-1));
      i--;
    }
  }
 }

}
