import java.lang.reflect.Array;
import java.util.*;

import static java.lang.Math.abs;

class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String c = sc.next();
        String[] b =  new String[c.length()];
        String[] d = new String[c.length()];
        b = c.split("");
        d = c.split("");
        int count =0;
        for(int i =0; i < c.length()-1 ; i++){
            if(b[i].equals(b[i+1])){
               b[i+1] = Integer.toString(abs(Integer.parseInt(b[i+1]) - 1));
            count ++;
            }
        }
        int count1 =1;
        d[0] = Integer.toString(abs(Integer.parseInt(d[0]) - 1));
        for(int k=0; k < c.length() - 1; k++){
            if(d[k].equals(d[k+1])){
                d[k+1] = Integer.toString(abs(Integer.parseInt(d[k+1]) - 1));
                count1 ++;
            }
        }
        if(count <= count1){
            System.out.println(count);
        }else if(count > count1){
            System.out.println(count1);
        }
    }
}
