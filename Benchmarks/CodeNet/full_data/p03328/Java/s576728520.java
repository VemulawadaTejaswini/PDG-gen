import java.util.*;

class Main{
    public static void main(String[] args){
        int a, b, b_ = 0, x;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        for(int i = 1; i < b - a; i++){
            b_ += i;
        }
        x = b_ - b;
        System.out.println(x);
    }
}