import java.util.*;
public class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int N = sc.nextInt();
                Set<Integer> set = new HashSet<>();
                for(; N > 0; N--){
                        int num = sc.nextInt();
                        set.add(num);
                }   
                System.out.print(set.size());
        }   
}