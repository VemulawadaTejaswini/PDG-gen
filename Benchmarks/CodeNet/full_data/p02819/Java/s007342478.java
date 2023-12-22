import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        while(!is_prime(x))
            x++;

        System.out.println(x);
    }

    static boolean is_prime(int x){
        for(int i = 2;i*i <= x;i++){
            if(x%i==0)
                return false;
        }
        return true;
    }
}