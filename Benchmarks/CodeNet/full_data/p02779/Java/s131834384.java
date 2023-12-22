import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i:a){
            a[i] = scan.nextInt();
        }
        if (n%2!=0)
            System.out.println("YES");
        else
            System.out.println("NO");
        
    }
}
