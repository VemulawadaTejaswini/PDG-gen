import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),k=sc.nextInt(),q=sc.nextInt();
        int[] a = new int[n];
        for(int i = 0;i<n;i++){
            a[i] = k-q;
        }
        for(int i = 0;i<q;i++){
            a[sc.nextInt()-1] ++;
        }
        for(int i =0;i<n;i++){
            if(a[i]>0){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}