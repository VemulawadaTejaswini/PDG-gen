import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
        for (int i=0;i<N;i++) {
            int a = sc.nextInt();
            if (map.containsKey(a)) map.put(a, map.get(a)+1);
            else map.put(a, 1);
        }

        boolean flag = false;
        ArrayList<Integer> key = new ArrayList<Integer>(map.keySet());
        ArrayList<Integer> val = new ArrayList<Integer>(map.values());
        int size = key.size();
        if (size==1 && ((val.get(0)-1)==key.get(0) || 2*key.get(0)<=val.get(0))) flag=true;
        if (size==2 && key.get(0)==val.get(0) && val.get(1)>1) flag=true;

        if (flag) System.out.println("Yes");
        else System.out.println("No");
    }
}