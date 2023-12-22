import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int K = Integer.parseInt(sc.next());
        String str = sc.next();
        sc.close();
        int count = 0;
        for (int i = 0; i < N-1; i++) {
        	if (str.charAt(i) == str.charAt(i+1)) {
        		count++;
        	}
        }
        count += 2 * K;
        if (count >= N) {
        	System.out.println(N-1);
        }
        else {
        	System.out.println(count);
        }


    }
}