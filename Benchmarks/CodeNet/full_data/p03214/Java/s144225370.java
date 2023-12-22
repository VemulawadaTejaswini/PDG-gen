import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        String str = sc.nextLine();
        String[] s = str.split(" ");
        int[] a = new int[N];
        int ave = 0;
        for(int i=0;i<N;i++){
            a[i] = Integer.parseInt(s[i]);
            ave += a[i];
        }
        ave /= N;
        int abs = Math.abs(ave-a[0]);
        int b = 0;
        for(int i=1;i<N;i++){
            if(abs>Math.abs(ave-a[i])){
                abs = Math.abs(ave-a[i]);
                b = i;
            }
        }
        System.out.println(b);
    }
}
