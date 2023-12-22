import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int k = sc.nextInt();
	for(int i = 0; i<k; i++) {
	    if(i%2==0) {
		if(a%2!=0) a--;
		a = a/2;
		b = b+a;
	    }else {
		if(b%2!=0) b--;
		b = b/2;
		a = b+a;
	    }

	}


	System.out.println(a + " " +b);
    }
}