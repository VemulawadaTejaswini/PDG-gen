import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] v = new int[n];
        for(int i = 0 ; i < n ; i++ ){
            v[i] = sc.nextInt();
        }
        Arrays.sort(v);
        Double s = (v[0] + v[1]) / 2.0;
        for(int i = 2 ; i < n ; i++ ){
            s = (s + v[2]) / 2.0;
        }
        System.out.println(s);
    }
}