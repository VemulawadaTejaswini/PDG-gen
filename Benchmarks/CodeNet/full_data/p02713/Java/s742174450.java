import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner a =  new Scanner(System.in);
        int h = a.nextInt();
        int ans = 0;
        for(int i = 1; i <= h; i++){
            for(int j = 1; j <= h; j++){
                for(int k = 1; k <= h; k++){
                    int temp = gcd(i,j);
                    ans+=gcd(temp,k);
                }
            }
        }
        
        System.out.println(ans);
    }
    
    static int gcd(int x, int y){
        if(y == 0)return x;
        else{
            return gcd(y, x%y);
        }
    }
}