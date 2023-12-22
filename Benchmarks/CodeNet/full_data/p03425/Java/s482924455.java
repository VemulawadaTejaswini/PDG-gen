import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int Num=sc.nextInt();
		int mem[]=new int[5];
		int ans=0;
		
		for(int i=0;i<Num;i++){
			String str=sc.next();
			char s=str.charAt(0);
			if(s=='M') mem[0]++;
			else if(s=='A') mem[1]++;
			else if(s=='R') mem[2]++;
			else if(s=='C') mem[3]++;
			else if(s=='H') mem[4]++;
		}

		for(int i=0;i<=2;i++){
			for(int j=1;j<=3;j++){
				for(int k=2;k<=4;k++){
					if(i!=j && j!=k) ans+=mem[i]*mem[j]*mem[k];
				}
			}
		}

		System.out.println(ans);
	}
}