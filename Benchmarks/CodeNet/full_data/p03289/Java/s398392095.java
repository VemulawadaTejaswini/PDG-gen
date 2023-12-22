import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        String  S = sc.next();
        String s = S.substring(2,S.length()-1);
        int cnt = 0;
        int tmp = 0;

        boolean jud = false;

        if(S.charAt(0) == 'A'){
            for(int i = 0;i < s.length();i++){
                if(s.charAt(i) == 'C'){
                    cnt++;
                    tmp = i+2;
                }
            }
            if(cnt == 1){
                for(int i = 1;i < S.length();i++){
                    if(i != tmp){
                        if(Character.isUpperCase(S.charAt(i))){
                            jud = false;
                            break;
                        }else{
                            jud = true;
                        }
                    }
            }
            
        }        
        }
        if(jud == true){
            System.out.println("AC");
        }else{
            System.out.println("WA");
        }
    }
}