import java.util.Scanner;

class Main{


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);			//文字の入力
		int a = sc.nextInt();
		String S1 =sc.next();
		String S2 =sc.next();
		long mod = 1000000007;


		long ans = 0L;

		if(a ==1){
			System.out.println(3);
			return;

		}
		if(a == 2){
			System.out.println(6);
			return;

		}
		if(a == 3){
			if(S1.charAt(0) != S1.charAt(1) && S1.charAt(1) != S1.charAt(2)){
				System.out.println(12);
			}else{
				System.out.println(6);
			}
			return;

		}


		long form = 0;
		int start = 0;

		if(S1.charAt(0) == S1.charAt(1)){

			if(S1.charAt(2)==S1.charAt(3)){
				ans = 6;
				form = 2;
				start = 4;

			}else{
				ans =6;
				form = 1;
				start = 3;
			}			
		}else{
			if(S1.charAt(1)==S1.charAt(2)){
				ans = 6;
				form = 2;
				start = 3;

			}else{
				ans =12;
				form = 1;
				start = 2;
			}
		}

		for(int i = start;i < S1.length()-1;i++){

			if(form == 2){				//今、横型
				if(S1.charAt(i) == S1.charAt(i+1)){			//次、横型
					ans *= 3L;
					form = 2;
					i++;
				}else{						//次、たて型
					ans *= 1L;
					form = 1;

				}
			}else{				//今、縦型
				if(S1.charAt(i) == S1.charAt(i+1)){
					ans *= 2L;
					form = 2;
					i++;

				}else{
					ans *= 2L;
					form = 1;
				}
			}
			ans %=(long)mod;
		}


		System.out.println(ans);


	}
}