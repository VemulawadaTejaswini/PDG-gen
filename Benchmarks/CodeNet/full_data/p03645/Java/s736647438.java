import java.util.Scanner;
import java.util.ArrayList;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

        ArrayList<Integer> start = new ArrayList<Integer>();
        ArrayList<Integer> finish = new ArrayList<Integer>();
 
		for (int i=0; i < m; i++){
			int c1 = sc.nextInt();
			int c2 = sc.nextInt();
			if (c1 == 1){
			    start.add(new Integer(c2));
			}
			if (c2 == n){
			    finish.add(new Integer(c1));
			}
		}
 
		boolean flg=false;

        for(int i=0; i<start.size(); i++) {
            if (finish.contains(start.get(i))) {
                flg = true;
                break;
            } 
        }
        
		if(flg){
			System.out.println("POSSIBLE");
		}else{
			System.out.println("IMPOSSIBLE");
		}
 
	}
}