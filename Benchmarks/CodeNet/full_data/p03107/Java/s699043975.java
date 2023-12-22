import java.util.Scanner;

import java.util.*;

public class Main{
	static public void  main(String[] args){
		Scanner scan = new Scanner(System.in);

		String n  = scan.next();

		List<Boolean> l = new ArrayList<>();

		int t = 0;
		int f = 0;
		for(int i = 0; i < n.length() ; i++){
			//l.add(new Boolean(n.charAt(i) == '0'));
			if(n.charAt(i) == '0'){
				t++;
			}else{
				f++;
			}
		}
		if(t < f) {
			System.out.println(t*2);
		}else{
			System.out.println(f*2);
		}

		// int remove = 0;
		// while(true){
		// 	int ret = remove(l);
		// 	if(ret == 0){
		// 		System.out.println(remove);
		// 		return;
		// 	}else{
		// 		remove += ret;
		// 	}
		// }
	}


	static int remove(List<Boolean> l){
		Boolean p = null;
		int ret = 0;
		for(int i = 0 ; i < l.size(); i++){
			Boolean c = l.get(i);
			if(p != null && p.booleanValue() != c.booleanValue()){
				l.remove(i);
				l.remove(i-1);
				ret += 2;
				p = null;
			}else{
				p = c;
			}
		}
		return ret;
		
	}

}
