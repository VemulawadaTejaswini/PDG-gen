import java.util.Scanner;

public class Main{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] card = new int[n];
        
        for(int i = 0; i < m; i++) {
        	int ll = sc.nextInt();
        	int rr = sc.nextInt();
        	for(int j = ll - 1; j < rr; j++) {
        		card[j]++;
        	}
        }
        int cnt = 0;
        for(int i = 0; i < n; i++) {
        	if(card[i] == m) {
        		cnt++;
        	}
        }
        System.out.println(cnt);
    }
}