import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        if(c > d){
            int cha = c;
            c = d;
            d = cha;
        }
        int re = 1;
        for(int i = 1;i <= c; i++){
            if(c % i == 0 && d % i == 0){
                re = i;
            }
        }
        int g = c * d / re;
        int syu = g + 1 - g / c - g / d;
        int s = 0;
        int aa = a % g;
        int bb = b % g;
        if(aa - bb < 0){
            s = s + syu * (b - a + aa - bb) / g;
            for(int i = aa + 1;i <= bb ; i++){
                if(i % c != 0 && i % d != 0){
                    s++;
                }
            }
            s++;
        }else{
            s = s + syu * (aa - a - bb + b) / g;
            for(int i = bb + 1;i <= aa ; i++){
                if(i % c != 0 && i % d != 0){
                    s--;
                }
            }
        }
        System.out.println(s);
        sc.close();
    }
}