import java.util.*;

public class Main {
	public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    long c = sc.nextLong();
    boolean flg = Math.sqrt(a)+Math.sqrt(b)<Math.sqrt(c);

    if (flg){
    System.out.println("Yes");

    }else{
    System.out.println("No");

    }
}

}