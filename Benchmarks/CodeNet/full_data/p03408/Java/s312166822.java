import java.util.*;

class Main{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	String[] s = new String[100];
	for(int i=0; i<n; i++) {
		s[i] = sc.next();
	}
	int m = sc.nextInt();
	String[] t = new String[100];
	for(int i=0; i<m; i++) {
		t[i] = sc.next();
	}
	int counts = 1;
	int countt = 0;
	int answer = -m;
	for(int i=0; i<n; i++) {
		for(int j=i+1; j<n; j++) {
			if(s[i].equals(String.valueOf(s[j]))) {
				counts++;
			}
		}
		for(int k=0; k<m; k++) {
			if(s[i].equals(String.valueOf(t[k]))) {
				countt++;
			}
		}
		if(answer < counts-countt) {
			answer = counts-countt;
		}
		counts = 1;
		countt = 0;
	}
	System.out.println(answer);
}
}
