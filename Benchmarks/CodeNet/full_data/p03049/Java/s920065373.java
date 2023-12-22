import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			String[] S = new String[N];

			for(int i = 0 ; i < N ; i++){
				S[i] = sc.next();
			}


		sc.close();

		int result = 0;
		int count = 0;
		int Acount = 0;
		int Bcount = 0;
		int ABcount = 0;

		for(int i = 0 ; i < N ; i++){

			if(S[i].substring(0, 1).equals("B")){
				Bcount++;
			}
			if(S[i].substring(S[i].length()-1, S[i].length()).equals("A")){
				Acount++;
			}
			if(S[i].substring(0, 1).equals("B") && S[i].substring(S[i].length()-1, S[i].length()).equals("A")){
				ABcount++;
			}



	        for (int j = 0; j < S[i].length(); j++) {
	            result = S[i].indexOf("AB", j);
	            if (result != -1) {
	                count++;
	                j = result;
	            }
	        }
		}

		if(Acount == ABcount && Bcount == ABcount){
			System.out.println(count+ABcount);
		}
		if(Acount >= Bcount){
			System.out.println(count+Bcount);
		}
		if(Acount < Bcount){
			System.out.println(count+Acount);
		}
	}
}