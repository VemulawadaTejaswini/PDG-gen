import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int max=0;
        for(i=0; i<n-1; i++){
            int x;
            if(a[i] < a[i+1]){
                x = a[i+1]-a[i];
            }else{
                x = a[i]-a[i+1];
            }
            if(x > max){
                max = x;
            }
        }
        System.out.println(max);
    }
}