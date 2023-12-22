import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String cur = sc.next();
        boolean flag = true;
        StringBuilder sb = new StringBuilder();
        sb.append(cur);
        while(sb.toString().length()>0){
            String S = sb.toString();
            int len = S.length();
            if(len<5){
                flag=false;
                break;
            }
            if(S.charAt(len-1)=='m'){
                flag = S.substring(len-5,len).equals("dream");
                sb = new StringBuilder();
                sb.append(S.substring(0,len-5));
            }
            else if(S.charAt(len-1)=='e'){
                flag = S.substring(len-5,len).equals("erase");
                sb = new StringBuilder();
                sb.append(S.substring(0,len-5));
            }
            else if(S.charAt(len-1)=='r'&&S.charAt(len-3)=='s'){
                if(S.length()<6) flag = false;
                else{
                    flag = S.substring(len-6,len).equals("eraser");
                    sb = new StringBuilder();
                    sb.append(S.substring(0,len-6));
                }
            }
            else if(S.charAt(len-1)=='r'&&S.charAt(len-3)=='m'){
                if(S.length()<7) flag = false;
                else{
                    flag = S.substring(len-7,len).equals("dreamer");
                    sb = new StringBuilder();
                    sb.append(S.substring(0,len-7));
                }
            }
            else{
                flag = false;
            }
            if(!flag) break;
        }
        String ans = (flag==true)?"YES":"NO";
        System.out.println(ans);
    }
}
