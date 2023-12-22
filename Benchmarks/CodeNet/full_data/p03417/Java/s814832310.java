import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);
        int ans = 0;
        if(n == 1 & m == 1){
            ans = 1;
        }else if(n == 1 & m != 1){
            ans = m - 2;
        }else if(n != 1 & m == 1){
            ans = n - 2;
        }else{
            ans = (n-2) * (m-2);
        }
        System.out.println(ans);
    }
    
}
