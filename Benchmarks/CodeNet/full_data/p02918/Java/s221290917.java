import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();

        char[] c = s.toCharArray();

        int cnt = 1;

        for (int i=0; i<n-1; i++){
            if (c[i]!=c[i+1]){
                cnt++;
            }
        }
//        System.out.println(cnt);
        if (cnt%2==0){
            if (k>=cnt/2){
                cnt = 1;
            }else{
                cnt -= k*2;
            }
        }else{
            if (k>=cnt/2){
                cnt = 1;
            }else {
                cnt -= k*2;
            }
        }

        System.out.println(n-cnt);
    }

}