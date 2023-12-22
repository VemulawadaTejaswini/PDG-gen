import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        
        List<Long> list = new ArrayList<>();
        for(long i = 0; i <= B - A; i++) {
            list.add(A + i);
        }
        
        while(true) {
            List<Long> nextList = new ArrayList<>();
            for(long i = 0; i < list.size() - 1; i += 2) {
                nextList.add(list.get((int)i) ^ list.get((int)(i+1)));
            }
            
            if(list.size() % 2 == 1) {
                nextList.set(0, nextList.get(0) ^ list.get(list.size() - 1));
            }
            if(nextList.size() == 1) {
                System.out.println(nextList.get(0));
                return;
            }
            
            list = nextList;
        }
    }   
}