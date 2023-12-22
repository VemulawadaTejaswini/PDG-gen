import java.util.*;
public class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                String s = sc.next();
                int yono = 0;
                int[] a = new int[s.length()];
                for(int i = 1 ; i <= s.length() ; i++){
                        if(s.charAt(i - 1) == 'A'|| s.charAt(i - 1) == 'C' || s.charAt(i - 1) == 'G' || s.charAt(i - 1) == 'T'){
                                a[i - 1] = 1;
                        }else{
                                a[i - 1] = 0;
                        }
                }
                int pct = 0;
                for(int i = 0 ; i < s.length() ; i++){
                        if(a[i] == 1){
                                pct++;
                        }else{
                                pct = 0;
                        }
                        yono = Math.max(pct , yono);
                }
                System.out.println(yono);
        }
}