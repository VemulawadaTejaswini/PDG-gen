import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int N = S.length();

        boolean first = palindrome(S);
        boolean second = palindrome(S.substring(0,(N - 1) / 2));
        boolean third = palindrome(S.substring(((N + 3) / 2) - 1, N));

        if(first == true && second == true && third == true)
            System.out.println("Yes");
        else System.out.println("No");
	}
	public static boolean palindrome(String S){
        boolean flag = true;
        for(int i=0; i<S.length(); i++) {
            if(S.charAt(i) != S.charAt(S.length()-i-1))
                flag = false;
        }
		return flag;
	}
}