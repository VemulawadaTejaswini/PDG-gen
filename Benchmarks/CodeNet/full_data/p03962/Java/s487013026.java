import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        int i,cnt = 0;
        for(i=0;i<3;i++)
            a[i]=sc.nextInt();
        if(a[0]!=a[1]) cnt++;
        if(a[0]!=a[2]) cnt++;
        if(a[1]!=a[2]) cnt++;
        if(a[0]==a[1] && a[1]==a[2]) cnt=1;
        System.out.println(cnt);
    }
}
