import java.util.*;
import java.util.Collections;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        ArrayList<Integer> listx = new ArrayList<Integer>();
        ArrayList<Integer> listy = new ArrayList<Integer>();

        for(int i=0; i<N; i++){
            listx.add(sc.nextInt());
        }
        listx.add(X);
        for(int i=0; i<M; i++){
            listy.add(sc.nextInt());
        }
        listy.add(Y);

        Collections.sort(listx);
        Collections.sort(listy);
       
        if(listx.get(N)>=listy.get(0)){
            System.out.println("War");
        }
        else{
            System.out.println("No War");
        }
    }
}