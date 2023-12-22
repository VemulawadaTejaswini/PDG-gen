import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt(); int b = sc.nextInt();
    sc.close();
    int sum =0;
    
    if (a>=b) {sum += a;
    	a= a-1;}
    if (a<b) {sum += b;
    	b= b-1;}
   
      System.out.println(sum);
	}

}
