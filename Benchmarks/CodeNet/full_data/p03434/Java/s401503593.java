import java.util.*;


public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        List<Long> list = new ArrayList<Long>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextLong());
        }

        Collections.sort(list, Collections.<Long>reverseOrder());

        long sum = 0;
        for (int i = 0; i < list.size(); i++) {
            if(i % 2 == 0){
                sum += list.get(i);
            }else{
                sum -= list.get(i);
            }
        }

        System.out.println(sum);
    }
}
