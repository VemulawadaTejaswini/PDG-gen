import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.next());

        long count = 0;
        int i = 1;
        while(true) {
            if(x - (count + i) == i + 1) {
                i++;
                break;
            }else if(x - (count + i) < i + 1) {
                i = (int)(x-count);
                break;
            }else {
                count += i;
            }
            i++;
        }
        System.out.println(i);
    }   
}