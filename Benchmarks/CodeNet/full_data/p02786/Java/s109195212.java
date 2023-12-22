import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;

public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //ArrayList<Integer> list;
        List<Integer> list = new ArrayList<>();
        long hp = sc.nextLong();

        long count = 1;
        long at_count = 0;

        while(hp > 0){
            hp = hp/2;
            at_count += count;
            count = count*2;
        }
        System.out.println(at_count);
    
	}
}