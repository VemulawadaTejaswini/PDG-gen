import java.util.Scanner;
class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int k = K;
        int i = 1;
        if (N%10 == 0 && K == 10) {
        		i =2;
        		while (N > k) {
        			k *= K;
        			i++;
        		}
        		System.out.println(i);
        } else {
        		while (N > k) {
        			k *= K;
        			i++;
        		}
        		System.out.println(i);
        }
    }
} 