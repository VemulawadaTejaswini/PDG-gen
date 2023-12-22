import java.util.Scanner;
import java.util.TreeMap;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        TreeMap<String,TreeMap<Integer,Integer>> tree = new TreeMap<>();
        for (int i=0;i<n;i++){
            String s = sc.next();
            int p = sc.nextInt();
            if (!tree.containsKey(s)){
                tree.put(s,new TreeMap<>());
            }
            tree.get(s).put(p,i+1);
        }
        while (!tree.isEmpty()){
            TreeMap<Integer,Integer> t = tree.pollFirstEntry().getValue();
            while (!t.isEmpty()){
                System.out.println(t.pollLastEntry().getValue());
            }
        }
    }
}