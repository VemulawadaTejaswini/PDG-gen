import java.util.*;
import java.util.Collections;
import java.util.ArrayList;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        String[] S = new String[n];

        for(int i=0; i<n; i++){
            S[i] = sc.next();
            int lx = S[i].length();
            ArrayList<String> al = new ArrayList<String>();
            for(int j=0; j<lx; j++){
                al.add(String.valueOf(S[i].charAt(j)));
            }
            Collections.sort(al);
            S[i] = "";
            for(int j=0; j<lx; j++){
                S[i] += al.get(j);
            }
        }
        String ans = S[0];
        for(int i=1; i<n; i++){
            int ls = S[i].length();
            int la = ans.length();
            String b = "";
            int x = 0;
            for(int j=0; j<la; j++){
                for(int k=x; k<ls; k++){
                    if(ans.charAt(j)==S[i].charAt(k)){
                        b += String.valueOf((char)ans.charAt(j));
                        x = k +1;
                        break;
                    }
                }
            }
            ans = b;
        }

        ArrayList<String> list = new ArrayList<String>();
        int l = ans.length();
        if(l>1){
            for(int i=0; i<l-1; i++){
                list.add(ans.substring(i, i+1));
            }
            list.add(ans.substring(l - 1));
            Collections.sort(list);
            ans = "";
            for(int i=0; i<l; i++){
                ans += list.get(i);
            }
        }

        System.out.println(ans);
    }
}