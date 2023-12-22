import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        long sum = 0;
        int tmp = 2;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n-1; i++){
            while(true){
                if(tmp%2==0 || tmp%3==0 || tmp%5==0 || tmp%7==0 || tmp%11==0){
                    sb.append(tmp);
                    sb.append(" ");
                    sum += tmp;
                    tmp++;
                    break;
                }
                tmp++;
            }
        }
        System.out.println(tmp);
        for(int i=tmp; i<=100000; i++){
            if((sum+i)%(2*3*5*7*11) == 0 && (i%2==0 || i%3==0 || i%5==0 || i%7==0 || i%11==0)){
                System.out.println(new String(sb) + i);
                return;
            }
        }
    }
}
