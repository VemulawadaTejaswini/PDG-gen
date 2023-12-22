import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int cnt = 0;
		int sz = s.length();
		for(int i = 0; i < sz; ++i){
			for(int j = 6; j < 100; ++j){
				boolean works = true;
				String ns = "" + 2019*j;
				int nz = ns.length();
				if(i + nz > sz)break;
				for(int k = 0; k < nz; ++k){
					if(ns.charAt(k) != s.charAt(i+k)){
						works = false;
						break;
					}
				}
				if(works)cnt++;
			}
		}
		System.out.println(cnt);
	}
}
