import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
		Long[] l = new Long[N];
		for(int i=0;i<N;i++){l[i] = sc.nextLong();}
		Long temp = 0L;
		Long Ans = 0L;
		for(int i = 0;i<N-2;i++){
			temp = l[i];
			for(int j =0;j<N-i;j++){
				if(j==0){temp=(l[i]>l[i+1])?l[i+1]:l[i];}
				else{temp=(temp>l[i+1])?temp:l[i+1];}
				Ans += temp;
			}
		}
		System.out.println(Ans);
	}
}
