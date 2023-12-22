import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        String ans = "NO";
        for(int i = 0;i < b;i++){
            int num = (i+1)*a%b;
            if(num == c){
                ans = "YES";
            }
        }
        System.out.println(ans);
    }
}