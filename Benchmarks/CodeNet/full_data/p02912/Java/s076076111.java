import java.util.*;

public class Main{

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        Integer N = scan.nextInt();
        Integer M = scan.nextInt();
        ArrayList<Long> array = new ArrayList<Long>();

        for(int i=0;i<N;i++)
            array.add(scan.nextLong());

        for(int i=0;i<M;i++){
            Collections.sort(array,Comparator.reverseOrder());
            long a = array.get(0);
            array.remove(0);
            array.add(0,a/2);
        }

        long sum = 0;
        for(int i=0;i<N;i++){
            sum += array.get(i);
        }

        System.out.println(sum);
    }
}
