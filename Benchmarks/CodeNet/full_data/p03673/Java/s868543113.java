import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Deque<String> q = new ArrayDeque<>();
        for(int i = 0; i < n; i++){
            String c = sc.next();
            if(i % 2 == 0){
                q.addLast(c);
            }else{
                q.addFirst(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        if(n % 2 != 0){
            while(q.size() != 0){
                System.out.print(q.pollLast() + " ");
            }
        }else{
            while(q.size() != 0){
                System.out.print(q.pollFirst() + " ");
            }
        }
    }
}