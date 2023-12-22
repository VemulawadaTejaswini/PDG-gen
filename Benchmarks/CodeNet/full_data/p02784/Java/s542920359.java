
import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h=in.nextInt();
        int n=in.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        //Arrays.sort(a);
        for(int i=n-1;i>=0;i--){
            h-=a[i];
            if(h<=0){
                break;
            }
        }
        if(h<=0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
