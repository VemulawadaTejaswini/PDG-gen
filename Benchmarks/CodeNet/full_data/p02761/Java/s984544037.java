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

        	if(s[i] == 1 && c[i] == 0) {
        		System.out.println(-1);
        		return;
        	}
        }


        for(int i = 1; i < 9; i++) {
        	for(int j = 0; j < 9; j++) {
        		for(int k = 0; k < 9; k++) {
        			int[] temp = {i, j, k};
        			int ans = i * 100 + j * 10 + k;
        			boolean f = true;
        			for(int l = 0; l < m; l++) {
        				if(temp[s[l] - 1] != c[l]) {
        					f = false;
        					break;
        				}
        			}
        			if(f) {
        				System.out.println(ans);
        				return;
        			}
        		}
        	}
        }
        System.out.println(-1);
    }
}