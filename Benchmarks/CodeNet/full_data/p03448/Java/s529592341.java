import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        int tem = 0;
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x = sc.nextInt();
        
        for(int i=0;i<=a;i++){
            for(int j=0;j<=b;j++){
                for(int k=0;k<=c;k++){
                    if (500*i+100*j+50*k == x){
                        tem += 1;
                    }
                }
            }
        }
        
        System.out.printf("%d\n",tem);
        tem=0;
    }
}
