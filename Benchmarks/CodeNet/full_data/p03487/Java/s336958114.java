import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
 
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<Integer>();
        for(int i = 0; i < N; i ++){
            a.add(sc.nextInt());
        }
        Collections.sort(a);
        int L = a.size();
        int count=1;
        for(int i=0; i<N; i++){
            if(a.get(i+1) == a.get(i) && i != N-1){
                count ++;
            }else{
                if(count>=a.get(i)){
                    L -= count - a.get(i);
                }else{
                    L -= count;
                }
                count = 1;
            }
        }
        
        
    }
}