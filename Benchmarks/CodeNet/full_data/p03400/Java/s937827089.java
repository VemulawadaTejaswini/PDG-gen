import java.util.*;
public class Main{
	public static void main(String[] args){
		// 日 
		//7人 for->A*i(0<i<?)<D
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//限界日数
		int d = sc.nextInt();//
		int x = sc.nextInt();
		int a[] = new int[n];//i人目の参加者
		int date[] = new int[d];
		int datenum = 0;
		int total = 0;
		int count = 0;
		for(int i = 0; i < n;i++){//i人目の人をそれぞれ受け取り
			a[i] = sc.nextInt();
		}
	/*	for(int i = 0; i < d;i++){
			date[i] = datenum++;
		}
	*/
		//公式にiを代入して1人の食べた数をcount
		for(int peanum = 0; peanum < n;peanum++){//hensuuと何人目
			for(int hen = 0;(hen * a[peanum] + 1) <= d;hen++){//date
							count++;
			}
		}
		System.out.println(count+x);



		
		
	
	}
}
