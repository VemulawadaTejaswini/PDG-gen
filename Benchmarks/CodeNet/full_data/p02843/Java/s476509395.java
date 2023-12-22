import java.util.*;
class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int s = Integer.parseInt(sc.next());
        s %=1000;
        int n = s/100;
        int ans = 0;
        for(int i =0;i<=n;i++){
            for(int j =0;j<=n;j++){
                for(int k = 0;k<=n;k++){
                    for(int l =0;l<=n;l++){
                        for(int m=0;m<=n;m++){
                            if((i+j+k+l+m)==n&&i*1+j*2+k*3+l*4+m*5==s%100){
                                ans = 1;
                                break;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }
}