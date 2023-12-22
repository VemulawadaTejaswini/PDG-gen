import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main { //クラス名はMain
    public static void main(String[] args) {
        //コード
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        ArrayList<Long> ori = new ArrayList<Long>();
        ArrayList<Long> re = new ArrayList<Long>();

        for(int i=0; i<n; i++){
        	ori.add(Long.parseLong(sc.next()));
        }
        for(int l=0; l<ori.size(); l++){
	        for(int j=l+1; j<ori.size(); j++){
	        	long r = ori.get(l) * ori.get(j);
	        	re.add(r);
	        }
        }
        Collections.sort(re);
        for(int m=0; m<re.size(); m++){
        	if(m == k-1) {
        		System.out.println(re.get(m));
        	}
        }
    }
}