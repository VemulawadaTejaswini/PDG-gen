import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int ans = Math.abs(Math.max(Math.max(a,b),c)-Math.min(Math.min(a,b),c));

        System.out.println(ans)
    }
}