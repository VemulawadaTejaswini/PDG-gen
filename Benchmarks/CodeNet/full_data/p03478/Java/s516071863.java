import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int sum = 0;
        int souwa = 0;
        for(int n = 0; n < N ;n++){
            for(int i = 1;i < 5;i++){
            souwa += (n / (10^i) % 10);
            }
            if(souwa <= B || A <= souwa){
                sum+=souwa;
            }

            //reset
            souwa = 0;
        }
        System.out.println(sum);
    }
}