import java.util.*;

public class Main{
  public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int num1,num2,total = 0;
        num1 = N / 2;
        num2 = N % 2;
        total = num1 + num2;
        System.out.println(total);
	}
}