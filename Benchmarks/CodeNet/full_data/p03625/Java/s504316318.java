import java.util.*;
import java.util.Collections;
import java.util.ArrayList;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<N; i++){
            A[i] = sc.nextInt();
            list.add(A[i]);
        }

        Collections.sort(list);

        ArrayList<Integer> al = new ArrayList<Integer>();
        int x = 1;
        int y = 0;
        for(int i=1; i<N; i++){
            if(list.get(i)==list.get(i-1)){
                x += 1;
            }
            else{
                x = 1;
            }
            if(x==2){
                al.add(list.get(i));
                x = 0;
                y += 1;
            }
        }
        if(y<=1){
            System.out.println(0);
        }
        else{
            System.out.println(al.get(y - 1) * al.get(y - 2));
        }
    }
}