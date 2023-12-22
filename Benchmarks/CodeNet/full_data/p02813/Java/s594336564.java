import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    
    static int n;
    static List<String> list;

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        n = Integer.parseInt(sc.next());
        String p = "";
        String q = "";
        for(int i = 0; i < n; i++){
            p += sc.next();
        }
        for(int i = 0; i < n; i++){
            q += sc.next();
        }
        
        LinkedList<Integer> listA = new LinkedList<>();
        LinkedList<Integer> listB = new LinkedList<>();
        for(int i = 1; i <= n; i++){
            listA.add(i);
        }
        
        list = new ArrayList<>();
        permutation(listA, listB);
        Collections.sort(list);
        int a = 0;
        int b = 0;
        for(int i = 0; i < list.size(); i++){
           if(list.get(i).equals(p)){
               a = i;
           }
           if(list.get(i).equals(q)){
               b = i;
           }
        }
        
        System.out.println(Math.abs(a-b));
    }
    
    static void permutation(LinkedList<Integer> a, LinkedList<Integer> b){
        
        if(a.isEmpty()){
            String s = "";
            for(int i = 0; i < n; i++){
                s += b.get(i);
            }
            list.add(s);
            return;
        }
        
        for(int i = 0; i < a.size(); i++){
            b.addLast(a.removeFirst());
            permutation(a, b);
            a.addLast(b.removeLast());
        }
    }
}