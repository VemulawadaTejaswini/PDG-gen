import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int sc = scanner.nextInt();
        //System.out.println(sc);
//         String sc2 = scanner.next();
//                 System.out.println(sc2);
// }}
        List<String> list = new ArrayList<>();
        //list = Arrays.asList(sc2.split(" "));
        //             System.out.println(list);
        int i = 0;
        while(sc > i) {
            String sc2 = scanner.next();
            list.add(sc2);
            i++;
        }
        if(list.size() == new HashSet<>(list).size()) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}