import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long a=sc.nextLong(),b=sc.nextLong(),c=sc.nextLong();
    long l=a*a+2*a*b+b*b;
    if(l<c*c) {
    	System.out.println("Yes");
    }else {
    	System.out.println("No");
    }
  }
}
