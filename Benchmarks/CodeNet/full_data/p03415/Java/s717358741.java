import java.util.Scanner;

public class Main {
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        int start = Integer.parseInt(str[0]);
        int end = Integer.parseInt(str[1]);
        int ans = 0;
        for(int i = start; i <= end; i++){
            if(isValid(i)){
                ans++;
            }
        }
        System.out.println(ans);
    }
    
    static boolean isValid(int num){
        int digit1 = num % 10;
        int tmp2 = num - digit1;
        int digit2 = tmp2/10 % 10;
        int tmp3 = tmp2 - digit2 * 10;
        int digit3 = tmp3/100 % 10;
        int tmp4 = tmp3 - digit3 * 100;
        int digit4 = tmp4/1000 % 10;
        int tmp5 = tmp4 - digit4 * 1000;
        int digit5 = tmp5/10000 % 10;
        if(digit1 == digit5 & digit2 == digit4){
            return true;
        }else{
            return false;
        }
    }
   
}
