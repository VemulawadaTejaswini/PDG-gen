import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int N=scan.nextInt();
        int[] a=new int[N];
        int i;
        int max=0,min=1000;
        for(i=0;i<N;i++){
            a[i]=scan.nextInt();
            if(a[i]<min){
                min=a[i];
            }
            if(max<a[i]){
                max=a[i];
            }
        }
        System.out.println(max-min);

    }
}