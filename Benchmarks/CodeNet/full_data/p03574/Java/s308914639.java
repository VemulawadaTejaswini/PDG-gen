import java.util.Scanner;

public class Main {
public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		/*int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a == c){
			System.out.println(b);
		}else if(b == c){
			System.out.println(a);
		}else if(b == a){
			System.out.println(c);
		}else{
			System.out.println("error!");
		}
	}*/
		int Height = sc.nextInt();
		int Weight = sc.nextInt();
		String[] S = new String[Height];
		for(int i = 0 ; i < Height ; i ++){
			S[i] = sc.next();
		}
		int BombCounter;
		for(int i = 0; i < Height ; i++){
			for(int j = 0; j < Weight ; j++){
				BombCounter = 0;
				if(i != 0 && j >= 1){
					if(S[i-1].charAt(j-1)==('#')){
						BombCounter ++;
					}
				}
				if(i != 0){
					if(S[i-1].charAt(j)=='#'){
						BombCounter ++;
					}
				}
				if(i != 0 && j <= Weight - 2){
					if(S[i-1].charAt(j+1)=='#'){
						BombCounter ++;
					}
				}
				if(j >= 1){
					if(S[i].charAt(j-1)==('#')){
						BombCounter ++;
					}
				}
				if(S[i].charAt(j)==('#')){
					BombCounter ++;
				}
				if(j <= Weight -2){
					if(S[i].charAt(j+1)==('#')){
						BombCounter ++;
					}
				}
				if(i <= Height -2 && j >= 1){
					if(S[i+1].charAt(j-1)==('#')){
						BombCounter ++;
					}
				}
				if(i <= Height-2){
					if(S[i+1].charAt(j)==('#')){
						BombCounter ++;
					}
				}
				if(i <= Height-2 && j < Weight -2){
					if(S[i+1].charAt(j+1)==('#')){
						BombCounter ++;
					}
				}
				if(S[i].charAt(j)=='.'){
					System.out.print(BombCounter);
				}else{
					System.out.print("#");
				}
			}
			System.out.print("\n");
		}
}
}
