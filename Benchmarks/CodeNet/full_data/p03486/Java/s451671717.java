import java.util.Scanner;

public class Main {
    	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	char[] n = sc.next().toCharArray();
    	char[] s = sc.next().toCharArray();

        String nn_last = new String(n);
        String ss_last = new String(s);
        nn_last = new StringBuilder(nn_last).reverse().toString();
        ss_last = new StringBuilder(ss_last).reverse().toString();
        System.out.println(nn_last.compareTo(ss_last) < 0 ? "Yes" : "No");
    	}
    }