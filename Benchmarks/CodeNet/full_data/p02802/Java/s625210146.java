import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] AC = new int[N];
		int[] penalty = new int[N];
		int ACCnt = 0;
		int penaltyCnt = 0;
		for(int i = 0; i < M; i++){
		    int p = sc.nextInt() - 1;
		    String s = sc.next();
		    if(AC[p] == 1) continue;
		    if(s.equals("AC")){
		        AC[p] = 1;
		        ACCnt++;
		        penaltyCnt += penalty[p];
		    }else{
		        penalty[p]++;
		    }
		}
		System.out.println(ACCnt + " " + penaltyCnt);
	}
}