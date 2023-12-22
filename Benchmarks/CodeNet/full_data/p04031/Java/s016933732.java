import java.util.*;

public class Main {
    public static int ans[] ;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int list[] = new int[n];
        int ans = 0;

        int ave = 0;
       for(int i=0;i<n;i++){
           list[i] = sc.nextInt();
           ave += list[i];
       }
       if(ave%2==1){ ave++;}
       ave /= n;

       for(int i=0;i<n;i++){
           ans += (list[i]-ave)*(list[i]-ave);
       }

       System.out.println(ans);
    }
}
