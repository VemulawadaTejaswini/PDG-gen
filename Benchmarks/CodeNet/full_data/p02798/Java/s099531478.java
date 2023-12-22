import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0; i<n; i++){
			a[i]=sc.nextInt();
		}
		int[] b=new int[n];
		for(int i=0; i<n; i++){
			b[i]=sc.nextInt();
		}
		int ans=Integer.MAX_VALUE;
		for(int i=0; i<1<<n; i++){
			ArrayList<State> even=new ArrayList<>();
			ArrayList<State> odd=new ArrayList<>();
			for(int j=0; j<n; j++){
				if((i>>j & 1)==1){
					if(j%2==0){
						odd.add(new State(b[j],j));
					}else{
						even.add(new State(b[j],j));
					}
				}else{
					if(j%2==0){
						even.add(new State(a[j],j));
					}else{
						odd.add(new State(a[j],j));
					}
				}
			}
			if(n%2==0){
				if(even.size()!=odd.size()){
					continue;
				}
			}else{
				if(even.size()!=odd.size()+1){
					continue;
				}
			}
			Collections.sort(odd,(x,y)->(x.num-y.num));
			Collections.sort(even,(x,y)->(x.num-y.num));
			ArrayList<State> tmp=new ArrayList<>();
			for(int k=0; k<n/2; k++){
				tmp.add(even.get(k));
				tmp.add(odd.get(k));
			}
			if(even.size()>odd.size()){
				tmp.add(even.get(n/2));
			}
			if(!check(tmp)){
				continue;
			}
			ArrayList<Integer> index=new ArrayList<>();
			for(State s:tmp){
				index.add(s.index);
			}
			ans=Math.min(ans,bubble(index));
		}
		if(ans==Integer.MAX_VALUE){
			System.out.println(-1);
		}else{
			System.out.println(ans);
		}
	}
	static class State{
		int num,index;
		State(int num,int index){
			this.num=num;
			this.index=index;
		}
	}
	static int bubble(ArrayList<Integer> list){
		int count=0;
		for(int i=0; i<list.size(); i++){
			for(int j=list.size()-2; j>=0; j--){
				if(list.get(j)>list.get(j+1)){
					count++;
					Collections.swap(list,j,j+1);
				}
			}
		}
		return count;
	}
	static boolean check(ArrayList<State> list){
		for(int i=0; i<list.size()-1; i++){
			if(list.get(i).num>list.get(i+1).num){
				return false;
			}
		}
		return true;
	}
}
