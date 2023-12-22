import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        Deque<Integer> result=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(i%2==0){
                result.offerLast(scanner.nextInt());
            }else{
                result.offerFirst(scanner.nextInt());
            }
        }
        Iterator<Integer> itr=(n%2==0)?result.iterator():result.descendingIterator();
        System.out.print(itr.next());
        while(itr.hasNext()){
            System.out.print(format(" %d",itr.next()));
        }
        put("");


    }

    public static void put(Object object) {
        System.out.println(object);
    }
    public static String format(String string, Object... args) {
        return String.format(string, args);
    }
}