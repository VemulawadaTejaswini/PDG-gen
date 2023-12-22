import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long a=sc.nextLong(),b=sc.nextLong(),c=sc.nextLong();
    long d=c-a-b;
    if(4*a*b<d*d&&d>0) {
    	System.out.println("Yes");
    }else {
    	System.out.println("No");
    }
  }
}
