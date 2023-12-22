import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] s=new String[n];
		for(int i=0; i<n; i++){
			s[i]=sc.next();
		}
		Arrays.sort(s);
		ArrayList<State> c=new ArrayList<>();
		int count=1;
		for(int i=1; i<n; i++){
			if(!s[i-1].equals(s[i])){
				c.add(new State(s[i-1],count));
				count=1;
			}else{
				count++;
			}
		}
		c.add(new State(s[n-1],count));
		Collections.sort(c,(x,y)->(y.count-x.count));
			for(int i=0; i<c.size(); i++){
				System.out.println(c.get(i).s);
				if(!(i!=(c.size()-1) && c.get(i).count==c.get(i+1).count)){
					break;
				}
			}
	}
	static class State{
		String s;
		int count;
		State(String s,int count){
			this.s=s;
			this.count=count;
		}
	}
}
