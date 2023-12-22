import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] alphabet = new String[26];
        char c = 'a';
        for (int i = 0; i < 26; i++){
            alphabet[i] = String.valueOf(c++);
        }

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.nextLine();
        String t = sc.nextLine();
        Map<String, Integer> m = new HashMap<>();
        Map<String, Integer> tmp = new HashMap<>();
        String[] str  = t.split("");
        String[] S = s.split("");
        for(String string:str){
            int v;
            if(m.containsKey(string)){
                v=m.get(string) + 1;
            }else {
                v = 1;
            }
            m.put(string,v);
            tmp.put(string,v);
        }

        for(String j:S){
            if (m.containsKey(j)){
                int k = m.get(j);
                if (k>0){
                    m.put(j,k-1);
                }
            }else {
                System.out.println(-1);
                break;
            }
        }

        double tmp2=1;
        String min = "";
        for (String j:alphabet){
            if (tmp.containsKey(j)){
                double i = (tmp.get(j)-m.get(j))/tmp.get(j);
                if (tmp2>i){
                    tmp2=i;
                    min = j;
                }
            }
        }

        int count = (int)Math.floor(1.0/tmp2) + 1;
        int r = tmp.get(min)-(m.get(min)*count);
        int count2=0;
        for(String j:S){
           if (j.equals(min)){
               r--;
           }
            if(r==0){
                break;
            }
            count2++;
        }
        System.out.println(S.length*count + count2);



    }
}
