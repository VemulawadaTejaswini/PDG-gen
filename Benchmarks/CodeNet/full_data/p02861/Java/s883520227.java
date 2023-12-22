import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    
    static double[] x;
    static double[] y;
    static double ans;

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        x = new double[n];
        y = new double[n];
        for(int i = 0; i < n; i++){
            x[i] = Double.parseDouble(sc.next());
            y[i] = Double.parseDouble(sc.next());
        }
        ans = 0;
        
        LinkedList<Integer> listA = new LinkedList<>();
        LinkedList<Integer> listB = new LinkedList<>();
        for(int i = 0; i < n; i++){
            listA.add(i);
        }
        permutation(listA, listB);
        
        int a = 1;
        for(int i = 2; i <= n; i++){
            a *= i;
        }
        ans /= a;
        
        System.out.println(ans);
    }
    
    static void permutation(LinkedList<Integer> a, LinkedList<Integer> b){
        
        if(a.isEmpty()){
            for(int i = 0; i < b.size()-1; i++){
                int j = b.get(i);
                int k = b.get(i+1);
                ans += Math.sqrt((x[j]-x[k])*(x[j]-x[k]) + (y[j]-y[k])*(y[j]-y[k]));
            }
            return;
        }
        
        for(int i = 0; i < a.size(); i++){
            b.addLast(a.removeFirst());
            permutation(a, b);
            a.addLast(b.removeLast());
        }
    }
}