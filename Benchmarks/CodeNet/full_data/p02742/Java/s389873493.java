import java.util.*;

public class Main {
	public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    long a = sc.nextInt();
    long b = sc.nextLong();
    long ans = a * b/2;


    if (a * b % 2==1) ans++;
    System.out.println(ans);

    }


}