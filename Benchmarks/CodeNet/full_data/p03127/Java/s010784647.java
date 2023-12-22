import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long N = scan.nextLong();
        List<Long> list = new ArrayList<>();
        for (long i = 0; i < N ; i++) {
            list.add(scan.nextLong());
        }
        
        Collections.sort(list);
        list.removeIf(l -> l == 0);

        while(true){
            if (list.size() == 1){
                break;
            }
            Long first  = list.get(0);
            for(int i = 1; i <= list.size()-1; i++){
                Long target  = list.get(i);
                list.set(i,target % first);
            }
            Collections.sort(list);
            list.removeIf(l -> l == 0);
        }

        System.out.print(list.get(0));
    }
}
