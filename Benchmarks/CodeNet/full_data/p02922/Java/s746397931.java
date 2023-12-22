import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a= sc.nextInt();
    int b = sc.nextInt();
    int c=0;
    int n=0;
    while(n<=b){
      n=n+a-c++;
    }
    System.out.println(c);
  }
    
}