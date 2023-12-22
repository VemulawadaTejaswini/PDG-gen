import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int[] num = new int[4];
		int money = 0;
		for (int i = 0; i < 4; i++) {
			num[i] = new java.util.Scanner(System.in).nextInt();
		}
		if(num[0]>num[1])
		{
		money = num[1]*num[2]+ num[3]*(num[0]-num[1]);
		}
 
		if(num[0]<=num[1])
		{
			money = num[0]*num[2];
		}
    }
}