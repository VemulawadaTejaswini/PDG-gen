import java.util.*;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int n[] = new int[4];
		String m;
		for(int i = 0;i < N;i++){
			m = sc.next();
			if(m =="'P'")n[0]++;
			if(m =="'G'")n[1]++;
			if(m =="'W'")n[2]++;
			if(m =="'Y'")n[3]++;
		}
		N = 0;
		for(int k = 0;k < 4;k++)if(n[k]>0)N++;
		if(N==3)System.out.println("three");
		if(N==4)System.out.println("four");
	}
}
