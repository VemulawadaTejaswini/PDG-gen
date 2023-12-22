import java.util.Scanner;

class Main{



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		String string = sc.next();
		
		if(string.length()==2){
			if(string.charAt(0)==string.charAt(1)){
				System.out.print(1);
				System.out.print(" ");
				System.out.print(2);
				return;

			}
				
		}
		
		for(int i = 0;i < string.length()-2;i++){
			if(string.charAt(i) == string.charAt(i+1)){
				int k =  find(i,string);
				if(k != i){
					if(k > i){
						System.out.print(i+1);
						System.out.print(" ");
						System.out.print(k+1);
						return;
					}else{
						System.out.print(k+1);
						System.out.print(" ");
						System.out.print(i+2);
						return;
					}

				}else{
					System.out.println(-1 + " "+ -1);
					return;

				}

			}else if( string.charAt(i) == string.charAt(i+2)){
				System.out.print(i+1);
				System.out.print(" ");
				System.out.print(i+3);			
				return;
				
				

			}
		}
		System.out.println(-1 + " "+ -1);


	}
	static int find(int k,String string){

		for(int i = k;i >= 0;i--){
			if(string.charAt(k) != string.charAt(i)){
				return i;
			}
		}

		for(int i = k+1;i < string.length();i++){
			if(string.charAt(k) != string.charAt(i)){
				return i;
			}
		}
		return k;

	}
}