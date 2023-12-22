import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public int[] ue, naka, sita;
	public static void main(String[] args){
		Main meu = new Main();
	}
	
	public Main(){
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
