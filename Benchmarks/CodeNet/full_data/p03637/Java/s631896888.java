import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int count2 = 0;
        int count4 = 0;
        int oddcount = 0;

        for(int i = 0;i < n;i ++){
            a[i] = sc.nextInt();
        }
        for(int i = 0;i < n;i ++){
            if(a[i] % 2 ==  1){
                oddcount ++;
            }
            if(a[i] % 4 == 0){
                count4 ++;
            }else if(a[i] % 2 == 0){
                count2++;
            }
        }
        String ans;
        if(n == 2){
            if(oddcount == 0){
                ans = "Yes";
            }else{
                ans = "No";
            }
        }else if(n == 3){
            if(oddcount == 0){
                ans = "yes";
            }else if(oddcount == 1 || oddcount == 2){
                if(count4 >= 1){
                    ans = "Yes";
                }else{
                    ans = "No";
                }
            }else{
                ans = "No";
            }
        }else{
        if(count4 >= oddcount){
            ans = "Yes";
        }else{
            ans = "No";
        }
    }
    System.out.println(ans);

    }
}