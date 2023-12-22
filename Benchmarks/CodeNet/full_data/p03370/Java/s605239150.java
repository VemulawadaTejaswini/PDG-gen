import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int N=scan.nextInt();
        int X=scan.nextInt();
        int[] m=new int[N];
        int i;
        int count=0;
        int min=100000;
        for(i=0;i<N;i++){
            m[i]=scan.nextInt();
            X-=m[i];
            count++;
            if(m[i]<min){
                min=m[i];
            }
        }
        for(i=1;X-min>0;i++){
            X-=min;
            count++;
        }
        System.out.println(count);
    }
}