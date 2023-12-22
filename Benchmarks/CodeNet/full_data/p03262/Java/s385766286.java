import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0;i<n;i++){
			list.add(Math.abs(sc.nextInt() - x));
		}
		if(list.size() == 1){
			System.out.println(list.get(0));
			System.exit(0);
		}
		int g = sub(list.get(0),list.get(1));
		for(int i = 1;i<n-1;i++){
			g = sub(g,list.get(i+1));
		}
		System.out.println(g);
	}
	static int sub(int a, int b){
		 if (a < b) {
		        int tmp = a;
		        a = b;
		        b = tmp;
		    }

		    //ユークリッドの互除法
		    int r = -1;
		    while (r != 0) {
		        r = a % b;
		        a = b;
		        b = r;
		    }

		    return a; 
	}
}
