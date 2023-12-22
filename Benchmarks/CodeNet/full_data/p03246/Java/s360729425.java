import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final int n = sc.nextInt();
        
        final int[] evenCount = new int[100001];
        final int[] oddCount = new int[100001];
        
        for (int i = 0; i < n / 2; i++) {
            evenCount[sc.nextInt()]++;
            oddCount[sc.nextInt()]++;
        }
        
        int even1st = 0;
        int even2nd = 0;
        int odd1st = 0;
        int odd2nd = 0;
        
        for (int i = 0; i < n / 2; i++) {
            if (evenCount[even1st] <= evenCount[i]) {
                even2nd = even1st;
                even1st = i;
            }
            if (oddCount[odd1st] <= oddCount[i]) {
                odd2nd = odd1st;
                odd1st = i;
            }
        }
        
        int evenAdopt;
        int oddAdopt;
        
        if (even1st != odd1st) {
            evenAdopt = even1st;
            oddAdopt = odd1st;
            
        } else if (evenCount[even1st] + oddCount[odd2nd] < evenCount[even2nd] + oddCount[odd1st]) {
            evenAdopt = even2nd;
            oddAdopt = odd1st;
            
        } else {
            evenAdopt = even1st;
            oddAdopt = odd2nd;
        }
        
        System.out.println(n - evenAdopt - oddAdopt);
    }
}
