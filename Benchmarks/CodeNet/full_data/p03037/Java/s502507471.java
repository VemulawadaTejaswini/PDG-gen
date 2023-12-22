
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int min=0;
        int max=sc.nextInt();
        int m=sc.nextInt();
        for(int i=0;i<m;i++){
            int l=sc.nextInt();
            int r=sc.nextInt();
            if(min<l){
                min=l;
            }
            if(r<max){
                max=r;
            }
            if(max<l || min>r){
                System.out.println(0);
                return;
            }
        }
        System.out.println((max+1)-min);
    }
}