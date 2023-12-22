import java.util.*;
import java.lang.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        Integer kuchi = Integer.parseInt(scanner.next());
        Integer mishiyou_kuchi = Integer.parseInt(scanner.next());

        Integer i = 0;
        for(;;) {
            Integer total = kuchi * i;
            if ( i >  1) total = (kuchi * i) - (i - 1);

            if (1 == mishiyou_kuchi) {
                System.out.println(0);
                break;
            }else if (kuchi > mishiyou_kuchi) {
                System.out.println(1);
                break;
            }else if(total >= mishiyou_kuchi) {
                System.out.println(i);
                break;
            }
            i++;
        }
    }
}