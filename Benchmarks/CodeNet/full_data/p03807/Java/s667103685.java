import java.util.*;

class Main{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int cout = 0;
	for(int i=0; i<n; i++) {
		if(sc.nextInt() % 2 == 1) {
			cout++;
		}
	}
	if(cout % 2 == 1) {
		System.out.println("NO");
	} else {
		System.out.println("YES");
	}
}
}
