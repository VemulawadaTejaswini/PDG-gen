import java.util.*;

class Main{

    static int gcd(int x, int y){
        if( x < y ){
            int t = x;
            x = y;
            y = t;
        }
        if(y == 0) return x;
        return gcd(x % y, y);
    }
    public static void main(String[] args) {       
    Scanner stdIn = new Scanner(System.in);
    int n = stdIn.nextInt();
    int a[] = new int [n];
    Arrays.setAll(a, i -> stdIn.nextInt());
    int l[] = new int [n];
    int r[] = new int [n];
    int ans = 1;
    for(int i = 1 ; i < n; i++) l[i] = gcd(l[i-1], a[i-1]);
    for(int i = n - 2; i >= 0; i--) r[i] = gcd(r[i+1], a[i+1]);

    for(int i = 0; i < n; i++) ans = Math.max(ans, gcd(l[i], r[i]));
    System.out.println(ans);
   }
}
