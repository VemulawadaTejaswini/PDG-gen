import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    private static void nCombination3(int c) {
        int count = c;
        int num = 0;
        for (int i = 0; i < count - 2; i++) {
            for (int j = i + 1; j < count - 1; j++) {
                for (int k = j + 1; k < count; k++) {
                    num++;
                }
            }
        }
    }

    static List<Long> list = new ArrayList<Long>();
    static void solve(char a,String temp,int N){
        if(N>10) {
            return;
        }
        temp+=a;
        //System.out.println(temp);
        long value = Long.valueOf(temp);
        list.add(value);
        if(a>'0') {
            solve((char)((int)a-1),temp,N+1);
        }
        solve(a,temp,N+1);
        if(a<'9') {
            solve((char)((int)a+1),temp,N+1);
        }
    }


    public static void main(String[] args) {
        // write your code here
        Scanner sc=new Scanner(System.in);
        for(char c='1';c<='9';c++){
            solve(c,"",1);
        }
        Collections.sort(list);
        int a=sc.nextInt()-1;
        System.out.println(list.get(a));


    }
}
