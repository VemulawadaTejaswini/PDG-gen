import java.awt.*;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        HashMap<Integer,Integer> hm=new HashMap<>();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String s=sc.nextLine();
            int x=0;
            for(int j=0;j<10;j++){
                x=x+s.charAt(j);
            }

            if(hm.containsKey(x)){
                int y=hm.get(x);
                y++;
                hm.replace(x,y);
            }
            else{
                hm.put(x,1);
            }
        }
        long z=0;
        Set<Integer> set=hm.keySet();
        for(Integer i:set){
            int x=hm.get(i);
            z=z+(x-1)*(x)/2;
        }
        System.out.println(z);
    }
}