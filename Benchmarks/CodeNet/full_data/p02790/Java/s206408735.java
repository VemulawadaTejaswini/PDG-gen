import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;

public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //ArrayList<Integer> list;
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 1;
        long sum = 0;

        if( a >= b ) {
            for(int i = 0 ; i < a ; i++){
                sum += b * count;
                count = count * 10;
            }
        }else{
            for(int i = 0; i < b  ; i++){
                sum += a * count;
                count = count * 10;
            }
        }

        System.out.println(sum);
        }
        
	}
