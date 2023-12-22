import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long[] a = new long a;
        a[0] = sc.nextLong();
        a[1] = sc.nextLong();
        a[2] = sc.nextLong();
		sc.close();
		if(a[0]%2==1 && a[1]%2==1 && a[2]%2==1){
            Arrays.sort(a);
            System.out.println(a[0]*a[1]);
        }else{
        	System.out.println("0");
        }
	}
}
