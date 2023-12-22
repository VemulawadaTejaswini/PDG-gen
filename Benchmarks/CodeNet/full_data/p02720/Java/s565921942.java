import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long K =  sc.nextLong();


        Queue<Long> q = new LinkedList<>();
        for (int i = 1; i <10 ; i++) {
            q.offer((long)i);
        }

        int count = 0;
        long result = 0;
        while(!q.isEmpty()){
            count++;
            result = q.remove();
            long mod =result%10;
            if(mod ==0 ){
                q.offer(result*10);
                q.offer(result*10+1);
            }else if(mod ==9){
                q.offer(result*10+8);
                q.offer(result*10+9);
            }else{
                q.offer(result*10+mod-1);
                q.offer(result*10+mod);
                q.offer(result*10+mod+1);
            }
            if(count==K){
                break;
            }
        }



        System.out.println(result);
    }



}
