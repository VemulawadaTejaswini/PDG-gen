import java.util.Scanner;

public class Main {
    static int n;
    static int[] x,y;
    static double sum;
    static boolean[] used;
    static int[] num;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = Integer.parseInt(sc.next());
        x =new int[n];
        y = new int[n];
        for(int i=0;i<n;i++){
            x[i] = Integer.parseInt(sc.next());
            y[i] = Integer.parseInt(sc.next());
        }
        sc.close();
        sum = 0.0;
        used = new boolean[n];
        num = new int[n];
        int number = 1;
        for(int i=n;i>=1;i--){
            number*=i;
        }
        calc(0);
        System.out.println(sum/number);
    }

    public static void calc(int count){
        if(count == n){
            int xdiff,ydiff;
            for(int i=1;i<n;i++){
                xdiff = x[num[i]]-x[num[i-1]];
                ydiff = y[num[i]]-y[num[i-1]];
                sum+=Math.sqrt(xdiff*xdiff+ydiff*ydiff);
            }
        }else {
            for(int i=0;i<n;i++){
                if(!used[i]){
                    used[i] = true;
                    num[count] = i;
                    calc(count+1);
                    used[i] =false;
                }
            }
        }
    }
    
}