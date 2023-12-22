import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuffer str = new StringBuffer(sc.next());
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int q = sc.nextInt();
            if(q == 1){
                str.reverse();
            }else{
                int q2 = sc.nextInt();
                if(q2 == 1){
                    str.insert(0,sc.next());
                }else{
                    str.append(sc.next());
                }
            }
        }
        System.out.println(str.toString());
    }
}
