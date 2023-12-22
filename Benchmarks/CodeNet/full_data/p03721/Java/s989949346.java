import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        TreeSet<Integer> ts = new TreeSet<Integer>();
        HashMap<String, String> hashmap = new HashMap<String, String>();
		int N = scan.nextInt();
		int K = scan.nextInt();
		for (int i = 0; i<N ; i++){
			int cnt = scan.nextInt();
			int hoge = scan.nextInt();
			if(ts.add(Integer.valueOf(cnt))){
				hashmap.put(String.valueOf(cnt), String.valueOf(hoge));
			}else{
				int l = Integer.valueOf(hashmap.get(String.valueOf(cnt)));
				hashmap.put(String.valueOf(cnt), String.valueOf(l+ hoge));
			}
		}
		int k=0;
        for(Integer a : ts) {
        	k +=  Integer.valueOf(hashmap.get(String.valueOf(a)));
        	//System.out.println(k);
            if(k >= K) {
System.out.println(a);
break;
}
        }
	}

}
