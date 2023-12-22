import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer>[] peo=new ArrayList[n];
		for(int i=0; i<n; i++){
			peo[i]=new ArrayList<>();
			int a=sc.nextInt();
			for(int j=0; j<a; j++){
				int x=sc.nextInt()-1;
				int y=sc.nextInt();
				peo[i].add(x);
				peo[i].add(y);
			}
		}
		int ans=0;
		for(int i=0; i<1<<n; i++){
			int c=i;
			int index=0;
			int count=0;
			Boolean[] px=new Boolean[n];
			while(index!=n){
				if((c & 1)==1){
					if(px[index]!=null && px[index]!=true){
						break;
					}
					px[index]=true;
					count++;
					for(int j=0; j<peo[index].size(); j+=2){
						Boolean kp=false;
						if(peo[index].get(j+1)==1){
							kp=true;
						}else{
							kp=false;
						}
						if(px[peo[index].get(j)]!=null && px[peo[index].get(j)]!=kp){
							count=0;
							break;
						}
						px[peo[index].get(j)]=kp;
					}
					if(count==0){
						break;
					}
				}else{
					if(px[index]!=null && px[index]==true){
						count=0;
						break;
					}
					px[index]=false;
				}
				index++;
				c>>=1;
			}
			ans=Math.max(ans,count);
		}
		System.out.println(ans);
	}
}
