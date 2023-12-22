import java.util.Scanner;
import java.util.*;


public class Main{

	public static void main(String args[]){

		Scanner scan = new Scanner(System.in);

		int N =  scan.nextInt();
		int keta = String.valueOf(N).length();		//桁数が返される
		int sum = 0;			//合計値
		int waru = 1;

		for(int j = 0;j < keta;j++){

			for(int i = keta-1;i > 0;i++){
				waru *= 10;
			}
			sum += N/waru;
			keta--;
		}
		if(N%sum == 0){
			System.out.println("Yes");

		}else{
			System.out.println("NO");
		}

	}
}