import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double a=sc.nextDouble(),b=sc.nextDouble(),c=sc.nextDouble();
    double a1=Math.sqrt(a),b1=Math.sqrt(b),c1=Math.sqrt(c);
    if(a1+b1<c1) {
    	System.out.println("Yes");
    }else {
    	System.out.println("No");
    }
  }
}
