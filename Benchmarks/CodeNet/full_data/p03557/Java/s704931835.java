package atcoder;

import java.util.Arrays;
import java.util.Scanner;

public class N84 {
	public int[] ue, naka, sita;
	public static void main(String[] args){
		N84 meu = new N84();
	}
	
	public N84(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ue = new int[n];
		naka = new int[n];
		sita = new int[n];
		int i, meu, rinrin, ibubu, c=0;
		for(i = 0; i < n;++i){
			ue[i] = sc.nextInt();
		}
		for(i = 0; i < n;++i){
			naka[i] = sc.nextInt();
		}
		for(i = 0; i < n;++i){
			sita[i] = sc.nextInt();
		}
		Arrays.sort(ue);Arrays.sort(naka);Arrays.sort(sita);
		for(i = 0; i < n;++i){
			meu = naka[i];
			rinrin = Arrays.binarySearch(ue, meu);
			ibubu = Arrays.binarySearch(sita, meu);
			if(rinrin < 0){
				rinrin = (rinrin+1)*-1;
			}
			if(ibubu < 0){
				ibubu = (n-((ibubu+1)*-1));
			}else{
				ibubu = n-1-ibubu;
			}
			c += rinrin*ibubu;
		}
		System.out.println(c);
	}
}
