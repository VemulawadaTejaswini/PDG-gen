package ABC112;
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int M = sc.nextInt();
		ArrayList <Integer> yakusuuList = Main.yakusuu(M);
    
		int D = 1;

		for(int i = 0; i < yakusuuList.size(); i++){
			int an = M - (N-1)*yakusuuList.get(i);
			if(an <= 0){
				break;
			}
			if(an % yakusuuList.get(i) == 0){
				D = yakusuuList.get(i);
			}
		}
		System.out.println(D);
	}


	public static ArrayList <Integer>  yakusuu(int M) {
		ArrayList <Integer> yakusuuList = new ArrayList <Integer> ();
		for(int i=1; i<=M/2; i++){
			if(M % i == 0){
				yakusuuList.add(i);
			}
		}
		
		for(int i=yakusuuList.size()-1; i == 0; i--){
			int addNumber = M / yakusuuList.get(i);
			yakusuuList.add(addNumber);
		}
		return yakusuuList;
	}
}
