import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int[] stone=new int[N];
		ArrayList<Integer>[] path=new ArrayList[N];
		for(int i=0;i<N;i++){
			path[i]=new ArrayList<Integer>();
		}
		for(int i=0;i<N;i++){
			stone[i]=sc.nextInt();
		}
		for(int i=0;i<N-1;i++){
			int x1=sc.nextInt()-1;
			int x2=sc.nextInt()-1;
			path[x1].add(x2);
			path[x2].add(x1);
		}
		int i=0;
		while(true){
			i++;
			if(i==N){
				i=0;
			}
			if(path[i].size()==0||path[i].size()==1){
				continue;
			}
			int frag=0;
			for(int j=0;j<path[i].size();j++){
				if(path[path[i].get(j)].size()==1){
					frag++;
				}
			}
			if(frag==path[i].size()){
				//最後
				long sum=0;
				for(int j=0;j<path[i].size();j++){
					sum=sum+stone[path[i].get(j)];
				}
				if(sum==2*stone[i]){
					System.out.println("YES");
					return;
				}else{
					System.out.println("NO");
					return;					
				}
				

			}
			if(frag==path[i].size()-1){
				if(path[i].size()==2){
					for(int j=0;j<path[i].size();j++){
						if(path[path[i].get(j)].size()==1){
							if(stone[path[i].get(j)]==stone[i]){
								path[path[i].get(j)].remove(0);
								path[i].remove(j);
							}else{
								System.out.println("NO");
								return;
							}
						}
					}
				}else{
					long sum=0;
					for(int j=0;j<path[i].size();j++){
						if(path[path[i].get(j)].size()==1){
							sum=sum+stone[path[i].get(j)];
							path[path[i].get(j)].remove(0);
							path[i].remove(j);
							j--;
						}
					}
					if(sum>stone[i]&&sum<2*stone[i]){
						stone[i]=(int)(2*stone[i]-sum);
					}else{
						System.out.println("NO,"+i);
						return;						
					}
				}
			}
		}
	}
}