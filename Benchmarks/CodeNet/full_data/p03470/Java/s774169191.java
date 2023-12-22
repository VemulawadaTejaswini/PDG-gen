import java.util.*;

class Main{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] d = new int[n];
	int cout = 1;
	for(int i = 0; i < n; i++) {
		d[i] = sc.nextInt();
	}
	Arrays.sort(d);
	for(int i = 1; i < n; i++) {
		if(d[i] > d[i - 1]) {
			cout++;
		}
	}
	System.out.println(cout);
}
}
