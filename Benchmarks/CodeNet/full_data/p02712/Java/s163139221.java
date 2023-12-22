import java.util.*;

public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    long count = 0;
    long countA = 0;
    ArrayList<Long> a = new ArrayList<Long>();
    for(long i = 0;i < N;i++){
        count++;
        if(count % 15 == 0){
            // System.out.print(count + ",");
            continue;
        } else if(count % 3 == 0){
            // System.out.print("Fizz");
            continue;
        } else if(count % 5 == 0){
            // System.out.print("Buzz");
            continue;
        }
            a.add(count);
    }
        long print = 0;
        for(int i = 0;i < a.size();i++){
            print += a.get(i);
            // System.out.print(print);
        }
        System.out.println(print);
  }
}
