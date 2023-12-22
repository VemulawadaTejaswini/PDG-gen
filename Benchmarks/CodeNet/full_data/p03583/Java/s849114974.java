import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=n/4;i<3500;++i){
            for(int j=i;j<3500;++j){
                long a = n*i*j;
                long b = (4*i*j-n*j-n*i);
                if (b==0) continue;
                if (a%b==0 && a/b>=n/4) {System.out.println(i+" "+ j+ " "+a/b);return;}
            }
        }
    }
}
