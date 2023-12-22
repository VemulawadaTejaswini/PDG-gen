import java.util.PriorityQueue;
import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int ans = Integer.MAX_VALUE;
        int[] c = new int[3];
        // int[] d = new int[3];
        c[0] = 0 <= B - A ? B - A : Integer.MAX_VALUE;
        c[1] = 0 <= B - (-A) ? B - (-A) + 1 : Integer.MAX_VALUE;
        c[2] = 0 <= (-B) - (-A) ? (-B) - (-A)+2 : Integer.MAX_VALUE;
        // c[0] = 0 <= B - A ? B - A : Integer.MAX_VALUE;
        // c[0] = 0 <= B - A ? B - A : Integer.MAX_VALUE;
        // c[0] = 0 <= B - A ? B - A : Integer.MAX_VALUE;
        for(int num:c){
            if(num<ans)ans=num;
        }
        System.out.println(ans);
    }
}