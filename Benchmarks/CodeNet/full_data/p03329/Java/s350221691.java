import java.util.Scanner;

public class Main {
    public static int nowMin = Integer.MAX_VALUE;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        search(n,0,n);
        System.out.println(nowMin);
    }

    public static void search(int n,int c,int last){
        if(n == 0){
            if(nowMin > c)nowMin = c;
            return;
        }
        else if(n < 0||nowMin < c)return;
        int n9 = 0;
        int n6 = 0;
        for (int i = 1;Math.pow(9,i) <= last;++i){
            n9 = i;
        }
        for (int i = 1;Math.pow(6,i) <= last;++i){
            n6 = i;
        }
        for (int i = n9;i >= 1;--i){
            search(n - (int)Math.pow(9,i),c + 1,(int)Math.pow(9,i));
        }
        for (int i = n6;i >= 1;--i){
            search(n - (int)Math.pow(6,i),c + 1,(int)Math.pow(6,i));
        }
        int mm = c + n;
        if(nowMin > mm)nowMin = mm;
    }
}
