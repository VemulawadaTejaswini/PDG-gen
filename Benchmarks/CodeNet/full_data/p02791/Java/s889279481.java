import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;

public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        List<Integer> list = new ArrayList<>();

        int n = sc.nextInt();
        int count = 0;

        for(int i = 0; i < n ; i++){
            list.add(sc.nextInt());
        }

        for(int i = 0; i < n ; i++){
            if(list.get(i) <= list.get(list.get(i) - 1)){
                count++;
            }else{

            }
        }

        System.out.println(count);

        
    
	}
}