import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int p[][]=new int[3][2];
		List<Integer>[]acts=new ArrayList[4];
		for(int i=0;i<4;i++)acts[i]=new ArrayList<Integer>();
		for(int i=0;i<3;i++) {
			int a=sc.nextInt()-1;
			int b=sc.nextInt()-1;
			acts[a].add(b);
			acts[b].add(a);
		}
		boolean a=true;
		for(int i=0;i<4;i++) {
			int sum=acts[i].size();
			if(sum==3)a=false;
			
		}

		
		System.out.println(a?"YES":"NO");

	}

}
