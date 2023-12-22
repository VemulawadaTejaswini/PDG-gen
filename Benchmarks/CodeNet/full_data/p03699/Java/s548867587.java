import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] s = new int[n];
        int a = 0;
        for(int i = 0; i < n; i++){
            s[i] = scan.nextInt();
            a += s[i];
        }
        Arrays.sort(s);
        for(int i = 0; i < n; i++){
            if(a % 10 == 0){
                a -= s[i];
            }else{
                System.out.println(a);
                System.exit(0);
            }
        }
        System.out.println(a);
    }
}