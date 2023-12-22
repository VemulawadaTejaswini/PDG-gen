import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i=0;i<n;i++){
            a[i] = scan.nextInt();
        }
        int temp = a[0];
        for (int i=0;i<n;i++){
            if (temp == a[i]) {
                System.out.println("NO");
                break;
            }else{
                temp = a[i]; 
            }
        }
        System.out.println("YES");
    }
}