import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        // 整数の入力
        List<Integer> list = new ArrayList<>();
        int num = sc.nextInt();
        int count = 0;

        for(int i=0;i<num;i++){
            list.add(sc.nextInt());
        }
        
        for(int i=0;i<num;i++){
            if(list.get(i) % 2 == 1){
            }else{
                if(list.get(i) % 3 == 0 || list.get(i) % 5 == 0){
                } else{
                    count++;
                }
            }
        }
       
        if(count == 0){
            System.out.println("APPROVED");
        }else{
            System.out.println("DENIED");
        }


    
	}
}