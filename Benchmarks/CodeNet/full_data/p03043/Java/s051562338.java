import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        int tmp;
        double sum = 0,p;
        for(int i=0;i<n;i++){
            tmp = i+1;
            p = 1.0/n;
            while(tmp<=k-1){
                tmp*=2;
                p/=2.0;
            }
            sum+=p;
        }
        System.out.println(sum);
        System.out.flush();
        sc.close();
    }
}