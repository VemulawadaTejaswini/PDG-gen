import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long A = sc.nextLong();
    long B = sc.nextLong();
    final long K = sc.nextLong();
    sc.close();
    if((A-K)>=0) {
    	System.out.println((A-K)+" "+B);
    }else if((A-K)<0 && (B+(A-K))>=0) {
    	System.out.println("0 "+(B+(A-K)));
    }else {
    	System.out.println("0 0");
    }
  }
}