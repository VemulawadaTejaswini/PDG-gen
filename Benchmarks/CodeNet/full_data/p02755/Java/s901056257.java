import java.util.*;

class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Integer a = sc.nextInt();
        Integer b = sc.nextInt();
        for(int i=13;i<=10000;i++){
            double p = i*0.08;
            double q = i*0.10;
            Integer p_t = (int)p;
            Integer q_t = (int)q;
            if(p_t==a && q_t==b){
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);

    }
}
