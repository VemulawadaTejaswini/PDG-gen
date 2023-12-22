import java.util.Scanner;

public class ABC133C{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int left = sc.nextInt();
        int right = sc.nextInt();

        int ans;
        if(left / 2019 != right / 2019){
            ans = 0;
        }else{
            left %= 2019;
            ans = left * (left + 1) % 2019;
        }

        System.out.println(ans);
    }

}