import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();

        Set<Character> set = new HashSet<>();
        set.add(S.charAt(0));
        int i = dft(S,1,set);
        set.remove(S.charAt(0));

        i += dft(S,1,set);

        System.out.println(i);
    }

    static int mod = (int) (Math.pow(10,9) + 7);
    static int dft(String S, int idx , Set set){

        if(idx== S.length() ){
            if(set.size()>0) return 1;
            return 0;
        }
        char c = S.charAt(idx);

        int i =0;
        //use this char
        if(set.contains(c)){
            i += 0 ;
        }else{
            set.add(c);
            i += dft(S,idx+1,set);
            set.remove(c);
        }

        i+=dft(S,idx+1,set);

        if(i > mod ){
            return  i % mod;
        }
        return i;
    }

}