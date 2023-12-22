import java.util.*;

class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        int[] x = new int[n+1];
        for(int i = 0; i < n; i++){
            if(s.charAt(i) == 'E'){
                x[i+1] = x[i] + 1;
            }else {
                x[i+1] = x[i];
            }
        }
        int ans = n;
        for(int i = 1; i < n+1; i++){
            System.out.print(x[i]);
            ans = Math.min(ans,(i-1) - x[i-1] + x[n] - x[i]);
        }
        System.out.println(ans);
    }
}
