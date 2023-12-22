import java.util.*;
class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int odd = n - n / 2;
        double ret = (double) odd / n;
        System.out.println(ret);
        sc.close();
    }
}

