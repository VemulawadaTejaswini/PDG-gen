import java.util.*;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        long L = sc.nextLong();
        long R = sc.nextLong();

        long x = Math.min(2019, R - L + 1);
        long min = 2019;

        for(int i=0; i<=x; i++){
            for(int j=i+1; j<=x; j++){
                min = Math.min(min, ((L + i) * (L + j)) % 2019);
            }
        }
        System.out.println(min);
    }
}