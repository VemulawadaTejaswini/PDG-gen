import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	char[] a = sc.next().toCharArray();
	char[] b = sc.next().toCharArray();
	for(int i = 0; i<a.length*2; i++) {
	    if(i%2==0) System.out.print(a[i/2]);
	    else System.out.print(b[i/2]);
	}
	System.out.println();
    }
}