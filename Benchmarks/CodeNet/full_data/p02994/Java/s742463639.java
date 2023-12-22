import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int apple = 1000000;
        int n = Integer.parseInt(sc.next());
        int l = Integer.parseInt(sc.next());
        sc.close();
        for(int i=0;i<n;i++){
            sum+=l+i;
            if(Math.abs(apple) > Math.abs(l+i)){
                apple = l+i;
            }
        }
        System.out.println(sum-apple);
    }
}