import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int l = s.length();
        boolean flag = true;
        if(s.charAt(l - 1) == '1' || s.charAt(0) == '0') flag = false;
        else{
            for(int i = 0; i < l / 2; i++){
                if(s.charAt(i) != s.charAt(l - i - 2)){
                    flag = false;
                    break;
                }
            }
        }
        if(flag){
            int[] from = new int[l-1];
            int[] to = new int[l-1];
            int[] t = new int[l];
            int tnum = -1;
            for(int i = 0; i < l; i++){
                if(s.charAt(i) == '1'){
                    t[++tnum] = i;
                }
            }
            for(int i = 0; i < l-1; i++){
                from[i] = i; 
            }
            int tind = 0;
            for(int i = 0; i < l-2; i++){
                if(s.charAt(i) == '1'){
                    to[i] = t[++tind];
                }
                else{
                    to[i] = t[tind];
                }
                System.out.println((from[i]+1) + " " + (to[i]+1));
            }
            System.out.println((l-1) + " " + l);
        }
        else{
            System.out.println(-1);
        }
    }
 }


