import java.util.*;
import java.io.*;
public class Main {
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                PrintWriter ou = new PrintWriter(System.out);
                int n = Integer.parseInt(sc.next());
                long[] a = new long[n];
                for(int i = 0 ; i < n ; i++){
                        a[i] = Long.parseLong(sc.next());
                }
                sc.close();
                Arrays.sort(a);
                int yono = n;
                boolean ebishu = true;
                int now = 0;
                while(ebishu){
                        boolean nowh = true;
                        long hp = 0;
                        for(int i = 0 ; i <= now ; i++){
                                hp += a[i];
                        }
                        for(int i = now + 1 ; i < n && nowh ; i++){
                                if(hp * 2 < a[i]) nowh = false;
                                else hp += a[i];
                        }
                        if(nowh){
                                ebishu = false;
                        }else{
                                yono--;
                                now++;
                        }
                }
                ou.print(yono + "\n");
                ou.flush();
        }
}