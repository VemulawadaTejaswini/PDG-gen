import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int k = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int sum = 0;
        
        if(day <= k){
            for(int i = 0;i < day;i++){
                sum += X;
            }
        }else{
            for(int i = 0;i < k;i++){
                sum += X;
            }
            for(int i = 0;i < day - k;i++){
                sum += Y;
            }
        }
        System.out.println(sum);
    }
}