import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        char[] a = new char[n];
        
        for(int i = 0; i < n; i++) a[i] = sc.next().charAt(0);
        
        List<Character> nousedcolors = new ArrayList<Character>();
        
        for(int i = 1; i <= 10000; i++) nousedcolors.add((char)i);
        
        for(char c : a) nousedcolors.remove(c);
        
        int res = 0;
        
        for(int i = 1; i < n; i++){
            char c = a[i];
            
            if(a[i-1] == c){
                a[i] = nousedcolors.get(nousedcolors.size() - 1);
                nousedcolors.remove(nousedcolors.size()-1);
                res++;
            }
        }
        System.out.println(res);
    }
}
