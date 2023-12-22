import java.util.*;
public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        // input N,K
        int N = sc.nextInt();
        int K = sc.nextInt();
        
        int a = 0;
        int b = 0;
        int c = 0;
        
        int count = 0;
        
        for(a = 1 ; a <=N ; a++){
            for(b = 1 ; b <=N ; b++){
                if((a+b)%2 == 1){
                    continue;
                }else{
                    for(c = 1 ; c <=N ; c++){
                        if((b+c)%2 ==1 || (a+c)%2 ==1){
                            continue;
                        }else{
                            count = count+1;
                            System.out.println(a + " " + b + " " + c);
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}
