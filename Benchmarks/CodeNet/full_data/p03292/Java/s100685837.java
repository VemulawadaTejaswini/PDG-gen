import java.util.*;
import java.util.Collections;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i=0; i<3; i++){
            list.add(sc.nextInt());
        }

        Collections.sort(list);

        System.out.println(list.get(2) - list.get(0));
    }
}