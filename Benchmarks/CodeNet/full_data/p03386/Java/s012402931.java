import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int k = sc.nextInt();
		int arraynumber = b - a + 1;//配列の数
		int usironokazu = arraynumber - k;
		int a_b[] = new int[arraynumber];//OK
		int check[] = new int[100];
		int chechnumber = 0;
		int singi = 0;

		for (int i = 0;i < arraynumber;i++){//配列に数字格納
			a_b[i] = a;
			a++;
			//System.out.println(a_b[i]);
		}//OK
		for(int i = 0;i < k;i++){//
			System.out.println(a_b[i]);//エラー
			check[chechnumber] = a_b[i];
		//	System.out.println(check[chechnumber]);
			chechnumber++;
		}//OK
		//System.out.println(chechnumber);
		for(int i = arraynumber;usironokazu < i;usironokazu++){
			singi = 0;
			for(int h = 0;h <= chechnumber;h++){
			if(check[h] == a_b[usironokazu]){//
				singi ++;
				break;
			}
			
			}
			if(singi == 0){
				System.out.println(a_b[usironokazu]);
			}


		}//OK
		
		
	
	}
}
