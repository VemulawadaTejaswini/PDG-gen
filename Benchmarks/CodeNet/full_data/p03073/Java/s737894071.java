import java.util.*;

 
class Main {
 
    private static Scanner sc = new Scanner(System.in);

        public static void main(String[] args) {
            String s = sc.next();
            char s1='1';
            char s0='0';
            char[] si  = s.toCharArray();
            int ans1 =0;
            int ans2 = 0;
            if(si.length==0){
                System.out.println(0);
                return;
            }
                char now=s0;
                for(char curr:si){
                    if(curr==now){
                        if(now==s0){
                            now = s1;
                        }else{
                            now = s0;
                        }
                    }else{
                        ans1++;
                        if(now==s0){
                            now = s1;
                        }else{
                            now = s0;
                        }
                    }
                }
                now=s1;
                for(char curr:si){
                    if(curr==now){
                        if(now==s0){
                            now = s1;
                        }else{
                            now = s0;
                        }
                    }else{
                        ans2++;
                        if(now==s0){
                            now = s1;
                        }else{
                            now = s0;
                        }
                    }
                }
            if(ans1>ans2){
                System.out.println(ans2);
            }else{
                System.out.println(ans1);
            }
    }
}