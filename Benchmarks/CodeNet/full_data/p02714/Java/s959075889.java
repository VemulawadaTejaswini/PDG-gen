import java.util.*;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		String s = scan.next();
		int ans = 0;
		ArrayList<Integer> red = new ArrayList<Integer>();
		ArrayList<Integer> blue = new ArrayList<Integer>();
		ArrayList<Integer> green = new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			if(s.charAt(i) == 'R') {
				red.add(i);
			}else if(s.charAt(i) == 'B') {
				blue.add(i);
			}else {
				green.add(i);
			}
		}
		
		
		for(int i=0;i<n-2;i++) {
			char first = s.charAt(i);
			for(int j=i+1;j<n-1;j++) {
				if(first != s.charAt(j)) {
					char second = s.charAt(j);
					int k = j+1;
					if((first == 'R' && second== 'G') || (first == 'G' && second== 'R')){
						for(int l=0;l<blue.size();l++) {
							int put = blue.get(l);
							if(j-i != put-j && put>=k) {
								ans += 1;
							}
						}
					}else if((first == 'G' && second== 'B') || (first == 'B' && second== 'G')) {
						for(int l=0;l<red.size();l++) {
							int put = red.get(l);
							if(j-i != put-j && put>=k) {
								ans += 1;
							}
						}
					}else {
						for(int l=0;l<green.size();l++) {
							int put = green.get(l);
							if(j-i != put-j && put>=k) {
								ans += 1;
							}
						}
					}
				}
			}
		}
		
		System.out.println(ans);
	}	
	
	
	//最小公約数
	/*
	static int gcd (int a, int b) {
		int temp;
		while((temp = a%b)!=0) {
			a = b;
			b = temp;
		}
		return b;
	}
	*/
	
}
