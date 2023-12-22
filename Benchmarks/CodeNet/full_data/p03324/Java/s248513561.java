import java.util.Scanner;

public class Main {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		//A
		/*
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a+b < 17 && a < 9 && b < 9)
			System.out.println("Yay!");
		else
			System.out.println(":(");
		*/
		//B

		int d = sc.nextInt();
		int n = sc.nextInt();
		System.out.println((long)Math.pow(100,d)*n);

		//C
		/*
		int n = sc.nextInt();
		long [] a = new long[n];
		int counter  =0;
		for(int i = 0; i < n ; i++){
			a[i] = sc.nextInt();
		}
		while (true) {
			boolean flag = false;
			for (int j = 0; j < n; j++) {
				if (a[j] % 2 == 1)
					a[j] *= 3;
				else if (!flag){
					a[j] /= 2;
					flag = true;
				}
				else
					a[j] *= 3;
			}
			if (!flag)
				break;
			counter++;
		}
		System.out.println(counter);*/
	}
}
