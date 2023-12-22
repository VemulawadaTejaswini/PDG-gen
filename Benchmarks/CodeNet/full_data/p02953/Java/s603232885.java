import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        List<Integer> list = new ArrayList<Integer>(); 
        for(int i=1; i<=N; i++) {
            list.add(sc.nextInt());
        }
        
        Boolean flag = true;
        Boolean minus = false;
        int left = list.get(0);
        for(int i=1; i <N; i++) {
            if( list.get(i) >= left) {
//                System.out.println(list.get(i));
                left = list.get(i);
            }
            if(list.get(i) < left) {
//                System.out.println(list.get(i));
                if(left - list.get(i) > 2) {
                    flag = false;
                    break;
                }
                if(left - list.get(i) ==1) {
                    left -= -1;
                    if(!minus) {
                        minus = true;
//                        System.out.println("true");
                    }else {
                        flag = false;
//                        System.out.println("b");
                        break;
                    }
                }
            }
            
        }
        
        System.out.println(flag? "Yes":"No");
        
    }
}