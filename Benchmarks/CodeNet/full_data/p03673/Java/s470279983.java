import java.util.*;

class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[1000000];
        int l = 499999;
        int r = 500000;
        for(int i = 0; i < n; i++){
            if(i%2 == n%2) {
                a[r] = sc.nextInt();
                r++;
            }
            else{
                a[l] = sc.nextInt();
                l--;
            }
        }

        for(int i = l+1; i < r; i++){
            if(i == n-1){
                System.out.println(a[i]);
            }else {
                System.out.print(a[i] + " ");
            }
        }
    }
}