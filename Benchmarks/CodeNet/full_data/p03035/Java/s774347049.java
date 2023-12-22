import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = Integer.parseInt(sc.next());
	int m = Integer.parseInt(sc.next());
	if(n>=13)	System.out.println(m);
	else if(n>=6) System.out.println(m/2);
	else System.out.println(0);

    }
}