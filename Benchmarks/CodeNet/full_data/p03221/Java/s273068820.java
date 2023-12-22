import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int typeP_N = Integer.parseInt(scan.next());
        int countY_M = Integer.parseInt(scan.next());

        List< Map<Integer, Integer> > prefList = new ArrayList<>() ;
        for(int i =0; i<typeP_N; i++) {
            prefList.add(i, new TreeMap<Integer, Integer>());
        }

        String[] ans =  new String[countY_M + 1];




        int P, Y;
        for(int order = 1 ; order <= countY_M ; order++) {

            P = Integer.parseInt(scan.next());
            Y = Integer.parseInt(scan.next());

            prefList.get(P - 1).put(Y, order);
        }


        Map<Integer, Integer> city;
        int order2;
        int count;
        for(int i = 0; i < typeP_N; i++) {

            count = 0;

            city = prefList.get(i);
            for(int year : city.keySet()) {
                order2 = city.get(year);
                ans[order2] = String.format("%06d%06d", i+1 , ++count);
            }
        }


        for(int i = 1; i <=countY_M; i++) {
            System.out.println(ans[i]);
        }
    }
}