import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] s = new int[m];
        int[] c = new int[m];

        for(int i = 0; i < m; i++) {
        	s[i] = scan.nextInt();
        	c[i] = scan.nextInt();

        }

        int len = 9 * (int)Math.pow(10, n - 1);
        if(n == 1)
        	len++;
        int start = 0 + (int)Math.pow(10, n - 1);

        int[] list = new int[len];
        for(int i = 0; i < list.length; i++) {
        	list[i] = start++;
        }

        for(int i = 0; i < list.length; i++) {
        	boolean f = true;
        	String temp = Integer.toString(list[i]);
        	for(int j = 0; j < m; j++) {
        		if(!(temp.substring(s[j] - 1, s[j]).equals(String.valueOf(c[j])))) {
        			f = false;
        			break;
        		}
        	}
        	if(f) {
        		System.out.println(temp);
        		return;
        	}
        }



        System.out.println(-1);
    }
}