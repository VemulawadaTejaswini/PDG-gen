 
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

 class Main{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 0 ; i<x ; i++){
            a.add(scan.nextInt());
        }
        for(int i = 0 ; i <x ; i++){
            int temp = a.get(i);
            a.set(i, 0);
            System.out.println(Collections.max(a));
            a.set(i,temp);
        }
    }
}
