import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String alp = "abcdefghijklmnopqrstuvwxyz";
        char[] alps = alp.toCharArray();
        String s = sc.next();
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < alps.length; i++){
            String chk = s;
            int tmp = 0;
            while(chk.replace(String.valueOf(alps[i]),"").length() != 0){
                StringBuilder sb = new StringBuilder();
                for(int j = 0; j < chk.length()-1; j++){
                    if(chk.charAt(j+1) == alps[i]){
                        sb.append(alps[i]);
                    }else{
                       sb.append(chk.charAt(j));
                    }
                }
                chk = sb.toString();
                tmp++;
            }
            ans = Math.min(ans, tmp);
        }
        System.out.println(ans);
    }
    
}