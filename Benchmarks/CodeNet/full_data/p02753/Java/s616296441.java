import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Long> list = new ArrayList<>();
        for(int i = 0; i < 3; i++){
            Long num = sc.nextInt();
            list.add(num);
        }
       	Long N = list.get(0);
        Long A = list.get(1);
        Long B = list.get(2);
        Long C = 0;
          
        if(A == 0){
            System.out.println("0");
        }else if(N <= A){
            System.out.println(N);        
        }else if(N <= A + B){
            System.out.println(A);
        }else{
            while(N >= A+B){
                C++;
                N = N-(A+B);
            }
            System.out.println(C*A + N);
        }
    }
}
