import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scanner=new Scanner(System.in);
        int K=scanner.nextInt();
        int keta=0;
        int kazu=1;
        for(int i=0;i<K;i++){
            if(kazu==10){
                kazu=1;
                keta++;
            }
            System.out.println(func2(keta,kazu));
            kazu++;
        }
    }
    public static long func(long x){
        if(x/10==0){
            return x%10;
        }
        return x%10+func(x/10);
    }
    public static String func2(int keta,int kazu){
        StringBuilder result=new StringBuilder();
        result.append(kazu);
        for(int i=0;i<keta;i++){
            result.append(9);
        }
        return result.toString();
    }
    
}
