import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main{
    static boolean[] isWork;
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt();
        int k = stdIn.nextInt();
        int c = stdIn.nextInt();
        String s = stdIn.next();
        char[] cs = s.toCharArray();

        isWork = new boolean[n];
        for(int i=0; i<n; i++){
            isWork[i] = true;
        }

        for(int i=0; i<cs.length; i++){
            if(cs[i] != 'x'){
                ArrayList<Integer> list = new ArrayList<Integer>();
                list.add(i);
                tansaku(cs, i, c, k-1, list);
            }
        }

        for(int i=0; i<n; i++){
            if(isWork[i]){
                System.out.print((i+1) + " ");
            }
        }
    }

    static void tansaku(char[] cs, int lastIdx, int c, int havetowork, ArrayList<Integer> list){
        if(havetowork == 0){
            int nextStart = 0;
            while(!list.isEmpty()){
                int item = list.remove(0);
                for(int i=nextStart; i<item; i++){
                    isWork[i] = false;
                }
                nextStart = item + 1;
            }
            for(int i=nextStart; i<cs.length; i++){
                isWork[i] = false;
            }
            return;
        }

        for(int i=lastIdx+1+c; i<cs.length; i++){
            if(cs[i] != 'x'){
                ArrayList<Integer> newlist = (ArrayList<Integer>) list.clone();
                newlist.add(i);
                tansaku(cs, i, c, havetowork-1, newlist);
            }
        }
    }
}