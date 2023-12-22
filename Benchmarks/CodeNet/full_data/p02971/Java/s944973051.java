 
 
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
  class Main {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 0 ; i<x ; i++){
            a.add(scan.nextInt());
        }
         
            int max = a.get(0);
        for(int i = 0 ; i<x ; i++){
            if(a.get(i) == max){
                int temp = a.get(i);
                a.set(i, 0);
                max = Collections.max(a);
                System.out.println(max);
                a.set(i,temp);
            }else{
                System.out.println(max);
            }
        }
    }
}
