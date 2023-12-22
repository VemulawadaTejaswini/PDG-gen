import java.util.*;

import jdk.vm.ci.aarch64.AArch64.Flag;
public class Main{
    public static void main( String[] args) {
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         String s = sc.next();
         int max = 0;
        for (int i = 0; i < n; i++) {
             String s1 = s.substring(0,i);
             String s2 = s.substring(i);
             int count = 0;
            for(char c ='a'; c <= 'z'; c++){
                boolean flag1 = false;
                for(int j = 0; j < s1.length(); j++){
                    if(c==s1.charAt(j)){
                        flag1 = true;
                        break;
                    }
                }
                boolean flag2 = false;
                for(int j = 0; j < s2.length(); j++){
                    if(c==s2.charAt(j)){
                        flag2 = true;
                        break;
                    }
                }
                if(flag1 && flag2){
                    count++;
                }
            }
            max = Math.max(max, count);
        }   
        System.out.println(max);
    }
}