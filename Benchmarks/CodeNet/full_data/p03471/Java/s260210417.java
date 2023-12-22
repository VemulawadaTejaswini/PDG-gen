import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int y = sc.nextInt();
        y /= 1000;
        boolean max = false;

        for (int i=0; i<=n; i++) {
            if(max){
                break;
            }
            for(int j=0; j<=n-i; j++){
                if(max){
                    break;
                }
                for(int k=0; k<=n-i-j; k++){
                    long sum = i*10+j*5+k;
                    if(sum==y && i+j+k==n){
                        System.out.println(i+" "+j+" "+k);
                        max = true;
                        break;
                    }
                }
            }
        }

        if(max==false){
            System.out.println(-1+" "+-1+" "+-1);
        }
    }
}
