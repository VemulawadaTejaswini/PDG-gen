import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int N  =sc.nextInt();
        int K = sc.nextInt();
        int num = 0;
        for(int i=0;i<N;i++){
            int h = sc.nextInt();
            if(K<=h)num++;
        }
        System.out.println(num);
    }
}