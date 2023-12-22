import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        int a[] =new int[101];
        for(int i=0;i<a.length;i++){
            a[i]=0;
        }
        int tot=0;
        while(t-->0){
            int n=sc.nextInt();
            if(a[n]==0){
                tot++;
                a[n]=1;
            }
        }
        System.out.println(tot);
    }
}