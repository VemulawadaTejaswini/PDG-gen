import java.util.Scanner;

public class Main {
	public static void main(String[] args){



		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();

		int a = 0;
		for(int i=1;i<50000;i++) {
			if((int)(i*1.08)==n) {
				System.out.println(i);
				a=i;
				break;
			}

		}
		if(a==0)System.out.println(":(");
	}
}
/*
class City{
	int order;
	int prefecture;
	int year;
	int number;
	City(int order,int prefecture, int year){
		this.order = order;
		this.prefecture = prefecture;
		this.year = year;
	}
}
*/
