import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.ArrayList;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		long k=sc.nextInt();
		long mod=1000000007;
		long ans=1;
		ArrayList<Integer>[] list=new ArrayList[n];
		for(int i=0; i<n; i++){
			list[i]=new ArrayList<>();
		}
		for(int i=0; i<n-1; i++){
			int a =sc.nextInt()-1;
			int b =sc.nextInt()-1;
			list[a].add(b);
			list[b].add(a);
		}
		boolean[] visited=new boolean[n];
		ArrayDeque<Integer>  que=new ArrayDeque<>();
		que.add(0);
		long count1=1;
		long count2=0;
		long count3=0;
		while(!que.isEmpty()){
			int j=que.poll();
			visited[j]=true;
			for(int i:list[j]){
				if(!visited[i]){
					count3++;
					que.add(i);
				}
			}
			if(count1==1){
				ans*=k;
			}else if(count1==2){
				ans*=k-1-count2;
			}else{
				ans*=k-2-count2;
			}
			if(count2==0){
				count2=count3-1;
				count3=0;
				count1++;
			}else{
				count2--;
			}
		}
		System.out.println(ans);
	}
}


