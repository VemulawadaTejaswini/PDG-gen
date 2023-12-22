import java.util.*;

class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) a[i] = scan.nextInt();
        int[] out = new int[n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(a[j] == i + 1) System.out.print(j + 1 + " ");
            }
        }
        scan.close();
    }
    public static void main(String[] args){
        new Main().solve();
    }
}
