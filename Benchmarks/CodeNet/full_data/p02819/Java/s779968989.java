import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();
		while(isSosuu(X) == false){
			X ++;
		}
		System.out.println(X);
	}

	public static boolean isSosuu(int num){
		if(num == 2)return true;
		if(num % 2 == 0)return false;
		for(int i = 3;i < num;i += 2){
			if(num % i == 0)return false;
		}
		return true;
	}
}
