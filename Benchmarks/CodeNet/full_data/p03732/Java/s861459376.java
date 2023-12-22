import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		long W = sc.nextLong();
		ArrayList<Long>[] list = new ArrayList[4];
		long w1=0;
		for(int i = 0; i<4; i++){
			list[i]=new ArrayList<>();
		}
		for(int i = 0; i<n; i++){
			long w = sc.nextLong();
			long v = sc.nextLong();
			if(i==0){
				w1=w;
				list[0].add(v);
			}else{
				int y=(int)(w-w1);
					list[y].add(v);
					
			}
		}
		for(int i = 0; i<4; i++){
			list[i].sort(Comparator.reverseOrder());
		}
		for(int i = 0; i<4; i++){
			for(int j=1; j<list[i].size(); j++){
				list[i].set(j,list[i].get(j-1)+list[i].get(j));
			}
		}
		long ans=0;
		for(int i = -1; i<list[0].size(); i++){
			for(int j = -1; j<list[1].size(); j++){
				for(int k = -1; k<list[2].size(); k++){
					for(int l = -1; l<list[3].size(); l++){
						if(w1*(i+1)+(w1+1)*(j+1)+(w1+2)*(k+1)+(w1+3)*(l+1)<=W){
							long a=(i==-1)? 0:list[0].get(i);
							long b=(j==-1)? 0:list[1].get(j);
							long c=(k==-1)? 0:list[2].get(k);
							long d=(l==-1)? 0:list[3].get(l);
							ans=Math.max(ans,a+b+c+d);
						}
					}
				}
			}
		}
		System.out.println(ans);
	}
}
