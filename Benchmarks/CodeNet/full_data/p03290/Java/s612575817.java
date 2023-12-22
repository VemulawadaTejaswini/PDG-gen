import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int d=sc.nextInt();
		long g=sc.nextLong();
		long[][] list=new long[d][2];
		for(int i=0; i<d; i++){
			list[i][0]=sc.nextInt();
			list[i][1]=sc.nextInt();
		}
		int ans=Integer.MAX_VALUE;
		for(int i=0; i<1<<d; i++){
			int k=i;
			long point=0;
			int count=0;
			int ant=0;
			int gre=0;
			while(k>0){
				if((k & 1)==1){
					point+=list[count][0]*(count+1)*100+list[count][1];
					ant+=list[count][0];
				}else{
					gre=count;
				}
				k>>=1;
				count++;
			}
			if(g-point>0){
				long ty=0;
				int index=0;
				if(count==d){
					ty=100*(gre+1);
					index=gre;
				}else{
					ty=d*100;
					index=d-1;
					
				}
				if((int)Math.ceil((g-point)/ty)>list[index][0]){
					continue;
				}else{
					ans=Math.min(ans,ant+(int)Math.ceil((g-point)/ty));
				}
			}else{
				ans=Math.min(ans,ant);
			}
		}
		System.out.println(ans);
	}
}

