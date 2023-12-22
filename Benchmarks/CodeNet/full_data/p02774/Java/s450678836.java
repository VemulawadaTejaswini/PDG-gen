package atcoder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main { //クラス名はMain
    public static void main(String[] args) {
        //コード
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        ArrayList<Integer> ori = new ArrayList<Integer>();
        ArrayList<Integer> re = new ArrayList<Integer>();

        for(int i=0; i<n; i++){
        	ori.add(Integer.parseInt(sc.next()));
        }
        for(int l=0; l<ori.size(); l++){
        	if(l<n-1) {
	        	for(int j=l+1; j<ori.size(); j++){
	        		int r = ori.get(l) * ori.get(j);
	        		re.add(r);
	        	}
        	}
        }

        Collections.sort(re);

        for(int i=0; i<re.size(); i++){
        	if(i == k-1) {
        		System.out.println(re.get(i));
        	}
        }
    }
}