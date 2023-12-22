import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int n2 = n / 2;
		
		int numA[]; //10
		numA = new int[n2];
		
		int numB[];
		numB = new int[n2];
		int ka = 0;
		int kb = 0;
		int i = 0;
		
		for(i = 0; i < n; i++){
			if( i == 1 || i % 2 == 1){ //20
				numA[ka] = sc.nextInt();
				ka++;
			}else{
				numB[kb] = sc.nextInt();
				kb++;
			}
			
		}
		
		int Acount[];
		Acount = new int[100000];
		int Bcount[];
		Bcount = new int[100000];
		
		
		i = 0;
		for(i = 0; i < n2; i++){
			Acount[i] = 0; //初期化
		}
		for(i = 0; i < n2; i++){//40
			Bcount[i] = 0; //初期化
		}
		
		i = 0;
		for(i = 0; i < n2; i++){
			Acount[numA[i]] = Acount[numA[i]] + 1;
			
			
		}
		for(i = 0; i < n2; i++){
			Bcount[numB[i]] = Bcount[numB[i]] + 1;
			
		}
		
		Arrays.sort(Acount);
		Arrays.sort(Bcount);
		int ans = 0;
		
		
		if(Acount[99999] == n2 && Bcount[99999] == n2){
			ans = n2;
		}
		else{
			int sumA = 0;
			int sumB = 0;
			
			sumA = n2 - Acount[99999];
			sumB = n2 - Bcount[99999];
			ans = sumA + sumB;
			
		}
		
		System.out.println(ans);
	}
}
