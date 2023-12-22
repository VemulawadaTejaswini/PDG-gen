import java.util.*;
public class Main {
	public static void main(String[] args){
	
	//入力
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int i=1;
		while( i < N && i < 10){
			System.out.println(i);
			i++;
		}
		while( i< N ){
			System.out.print("1");
			for(int k=9;k<i;k++){
				System.out.print("9");
			}
			System.out.println("");
			i++;
		}
	}
}