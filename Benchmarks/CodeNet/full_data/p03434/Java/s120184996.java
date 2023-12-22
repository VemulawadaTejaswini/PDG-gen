import java.util.*;
import java.util.Collections;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int a = 0;
        int b = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i=0; i<N; i++){
            list.add(sc.nextInt());
        }

        Collections.sort(list, Collections.reverseOrder());

        for(int i=0; i<N; i++){
            if(i%2==0){
                a += list.get(i);
            }
            else{
                b += list.get(i);
            }
        }
        System.out.println(a - b);
    } 
}