

import java.util.Scanner;

// 7
public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[3][3];
        for(int i = 0; i < 3; i++)
        	for(int j = 0; j < 3; j++)
        		a[i][j] = sc.nextInt();
        int N = sc.nextInt();
        int[] b = new int[N];
        for(int i = 0; i < N; i++)
            b[i] = sc.nextInt();

        int count = 0;
        //if count >= 6 then break
        int i, j, k = 0;
        for(i = 0; i < 3; i++)
        	for(j = 0; j < 3; j++) {
        		for(k = 0; k < N; k++) {
        			if(b[k] == a[i][j]) {
        				a[i][j] = -1;
        				++count;
        				if(count == 6) {
        					i = j = k = 10;
        					System.out.println("Yes");
        				}
        			}
        		}
        	}
        
        String ans = "No";
        if(count < 6) {
        	for(int ii = 0; ii < 3; ii++) 
        		if(a[ii][0] == -1 && a[ii][1] == -1 && a[ii][2] == -1) {
        			ans = "Yes";
        			break;
        		}
        	for(int jj = 0; jj < 3; jj++) 
        		if(a[0][jj] == -1 && a[1][jj] == -1 && a[2][jj] == -1) {
        			ans = "Yes";
        			break;
        		}
        	
        	if(a[0][0] == -1 && a[1][1] == -1 && a[2][2] == -1) {
        		ans = "Yes"; 
        	}
        	if(a[2][0] == -1 && a[1][1] == -1 && a[0][2] == -1) {
        		ans = "Yes"; 
        	}
        	System.out.println(ans);
        }
    }

}
