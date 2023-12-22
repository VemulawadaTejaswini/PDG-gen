import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Integer []AN  = new Integer[N];
        List<Integer> list = new LinkedList<>();
        for (int i=0;i<N;i++){
            AN[i]=sc.nextInt();
            list.add(AN[i]);
        }
        Collections.sort(list);

        //list.addAll(Arrays.asList(AN));
        Long cnt = 0L;

        for(int i=0;i<N;i++){
            int tmp = i + list.indexOf(AN[i]);

          //  System.out.println(AN[i]+" "+list.indexOf(AN[i])+" "+tmp);
            if (tmp%2!=0) cnt++;

        }
        System.out.println(cnt/2);

    }
 }
