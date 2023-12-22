import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int flag = 1;
        for(int i = 0; i < s.length()/2; i++){
            if(n%2 != 0){
                flag = 0;
                break;
            }
            if(s[i] != s[i+s.length()/2]){
                flag = 0;
                break;
            }
        }
        if(flag == 1){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}