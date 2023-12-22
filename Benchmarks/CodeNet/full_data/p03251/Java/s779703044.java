import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kna = sc.nextInt();
        int knb = sc.nextInt();
        int cca = sc.nextInt();
        int ccb = sc.nextInt();
        int[] a = new int[kna];
        int[] b = new int[knb];
        
        for(int i = 0;i < kna;i++)
            a[i] = sc.nextInt();
        for(int i = 0;i < knb;i++)
            b[i] = sc.nextInt();

        Arrays.sort(a);
        Arrays.sort(b);

        System.out.println(b[0]-a[kna-1] >= ccb-cca?"War":"No War");
        

        
    }
}