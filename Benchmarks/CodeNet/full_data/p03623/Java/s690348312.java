import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = Math.abs(x-sc.nextInt());
        int b = Math.abs(x-sc.nextInt());
        System.out.println(Math.min(a,b));
    } 
}