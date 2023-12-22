

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int mon=sc.nextInt();
		int taim=sc.nextInt();
		int mon2=sc.nextInt();
		
		if(mon*taim<mon2) {
			System.out.println(mon*taim);
		}else {
			System.out.println(mon2);
		}
	}
}

