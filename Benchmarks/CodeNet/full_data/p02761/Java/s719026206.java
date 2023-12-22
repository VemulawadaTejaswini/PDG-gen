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
        boolean al0 = true;
        for(int i=0;a.length>i;i++){
            if(a[i]!=0){
                al0 = false;
            }
        }
        if(error || al0){
            System.out.println(-1);
            return;
        }

        if(a[0]==0 && n!=1){
            a[0]=1;
        }
        String ans = "";
        for(int i=0;a.length>i;i++){
            ans += a[i];
        }
        System.out.println(ans);
    }
}