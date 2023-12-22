import java.util.*;
public class Main{
	
	//int[][] ar=new int[]
	public static int ways(int x,int y,int i,int j) {
		if(x==i && y==j)
			return 1;
		if(x<i || y<j)
			return 0;
		return (ways(x,y,i+1,j+2)%1000000007+ways(x,y,i+2,j+1)%1000000007)%100000007;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.println(ways(x,y,0,0)%1000000007);
	}
}