import java.util.Scanner;
public class Main{
 public static void main(String[] args) {
   Scanner kbd = new Scanner(System.in);
  int n=kbd.nextInt();
  int m=kbd.nextInt();

  int x;
  if(n==0){
    x=(m*(m-1))/2;
  }else if(m==0){
    x=(n*(n-1))/2;
  }else{
  x=(n*(n-1))/2+(m*(m-1))/2;
}
  System.out.println(x);
}
}
