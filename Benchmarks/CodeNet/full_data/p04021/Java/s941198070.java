
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Integer []AN  = new Integer[N];
        Integer []BN = new Integer[N];
        List<Integer> list = new LinkedList<>();
        for (int i=0;i<N;i++){
            AN[i]=sc.nextInt();
            BN[i]=AN[i];
            //list.add(AN[i]);
        }
        list.addAll(Arrays.asList(BN));
        Arrays.sort(BN);


        //list.addAll(Arrays.asList(AN));
        Long cnt = 0L;

        for(int i=0;i<N;i++){
            int tmp = i + Arrays.binarySearch(BN, AN[i]);

            //System.out.println(AN[i]+" "+list.indexOf(AN[i])+" "+tmp);
            if (tmp%2!=0) cnt++;

        }
        System.out.println(cnt/2);

    }
 }
