import java.util.*;
class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		for (int i = 0; i < n; i++){
			int temp = sc.nextInt();
			//~ System.out.println(temp);
			if (temp % 2 == 0){
				if (temp % 3 != 0 && temp % 5 != 0){
					count++;
					//~ System.out.println(temp + " " + temp % 3 + " " + temp % 5);
				}
			}
		}
		if (count == 0)
			System.out.println("APPROVED");
		else
			System.out.println("DENIED");
	}
}
