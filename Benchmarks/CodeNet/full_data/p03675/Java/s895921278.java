import java.util.*;
import java.io.*;

public class Main{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n == 1){
            System.out.print(in.nextInt());
            return;
        }
        Deque<Integer> dq = new LinkedList<>();
        boolean flag = false;
        for (int i = 0; i < n; i++){
            if (!flag){
                dq.addLast(in.nextInt());
            } else {
                dq.addFirst(in.nextInt());
            }
            flag = !flag;
        }
        if (flag){
            while (dq.size() != 1){
                System.out.print(dq.pollFirst());
            }
        } else {
             while (dq.size() != 1){
                System.out.print(dq.pollLast());
            }           
        }
        System.out.print(dq.pollLast());
    }
}