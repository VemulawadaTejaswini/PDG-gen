import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    long A=sc.nextLong();
    long B=sc.nextLong();
    long k=sc.nextLong();
    for(int i=0;i<k;i++) {
      if(A>=1) {
        A--;
      } else{
        B--;
      }
    }
    System.out.println(A);
    System.out.println(B);    
  }
}