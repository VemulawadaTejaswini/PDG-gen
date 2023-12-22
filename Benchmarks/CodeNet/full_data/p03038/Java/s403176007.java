import java.util.Arrays;
import java.util.Scanner;
 
public class Main{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long[] cards = new long[n];
        long sum = 0;
        for(int i = 0; i < n; i++) {
        	cards[i] = sc.nextInt();
        	//sum += cards[i];
        }
        
        for(int i = 0; i < m; i++) {
        	int b = sc.nextInt();
        	long c = sc.nextInt();
        	Arrays.sort(cards);
        	int j = 0;
        	while(cards[j] < c && j < b) {
        		//sum += c - cards[j];
        		cards[j] = c;
        		j++;
        	}
        }
        for(int i = 0; i < n; i++) {
        	sum += cards[i];
        }
        System.out.println(sum);
    }
}