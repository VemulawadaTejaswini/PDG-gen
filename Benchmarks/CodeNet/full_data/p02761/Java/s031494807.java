import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[] = new int[n];
        boolean error = false;
        for(int i=0;i<m;i++){
            int s = sc.nextInt();
            int c = sc.nextInt();
            if(a[s-1] == 0 ||a[s-1] == c){
                a[s-1] = c;
            }else{
                error = true;
                break;
            }
        }
        if(a[a.length-1]==0){
            error = true;
        }
        if(error){
            System.out.println(-1);
            return;
        }
        int ans = 0;
        for(int i=a.length;i>0;i--){
            ans += Math.pow(10,a.length - i)*a[i-1];
        }
        System.out.println(ans);
    }
}