import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        String[] list = new String[N];
        for(int i = 0; i < n; i++) {
            String city = sc.next();
            int point = sc.nextInt();
            list[i] = city + "_" + (200 - point) + "_" + (i+1);
        }
        Arrays.sort(list);

        for(int i = 0; i < N; i++) {
            String ans = list[i].split("_")[2];
            System.out.println(ans);
        }   
    }
}