import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int x = sc.nextInt();
        int min = (int)Math.max(-1000000, x-k+1);
        int max = (int)Math.min(1000000, x+k-1);
        for(int i = min; i<=max; i++) System.out.print(i + " ");
        System.out.println();
    }
}