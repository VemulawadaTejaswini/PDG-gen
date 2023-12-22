import java.util.Scanner;
public class Main{
	static long goal;
	static long min;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		goal = sc.nextLong();
		min=goal;
		dfs(0,0);
		System.out.println(min);
	}
	public static void dfs(long sec,long place){
		if(place>goal){
			return;
		}else if(place==goal){
			if(sec<min){
				min=sec;
				return;
			}
		}
		if(sec>goal){
			return;
		}
		sec++;
		dfs(sec,place);
		dfs(sec,place+sec);
	}
}