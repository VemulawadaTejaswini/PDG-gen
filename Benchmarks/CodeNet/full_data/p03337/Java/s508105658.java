import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = a-b;
        int y = b-a;
        int z = a*b;

        System.out.println(Math.max(x,Math.max(y,z)));
    }
}