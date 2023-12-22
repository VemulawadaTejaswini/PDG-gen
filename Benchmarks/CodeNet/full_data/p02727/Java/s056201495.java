
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int X=sc.nextInt(),Y=sc.nextInt(),A=sc.nextInt(),B=sc.nextInt(),C=sc.nextInt();
        int[] p =new int[A];
        int[] q =new int[B];
        int[] r =new int[C];
        List<Integer> a = new ArrayList<Integer>();
        for(int i=0;i<A;i++){
            int temp = sc.nextInt();
            a.add(temp);
        }
        for(int i=0;i<B;i++){
            int temp = sc.nextInt();
            a.add(temp);
        }
        for(int i=0;i<C;i++){
            int temp = sc.nextInt();
            a.add(temp);
        }
        Collections.sort(a,new java.util.Comparator<Integer>(){
            @Override
            public int compare(Integer i1,Integer i2) {
                return i2 - i1;
            }
        });
        long result = 0;
        for(int i=0;i<X+Y;i++){
            result += a.get(i);
        }
        System.out.println(result);




    }
}
