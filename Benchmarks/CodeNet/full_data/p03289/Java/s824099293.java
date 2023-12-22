import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        
        //先頭文字
        if(str1.charAt(0)=='A'){
            //先頭3文字目から後頭から2文字目までの間
            String str2 = str1.substring(2, str1.length()-1);
            int ct = 0;
            for(int i=0;i<str2.length();i++){
                if(str2.charAt(i) =='C'){
                    ct++;
                }
            }
            //AとC以外小文字
            if(ct==1){
                ct=0;
                for(int i=0;i<str1.length();i++){
                    if(Character.isUpperCase(str1.charAt(i))){
                        ct++;    
                    }
                }
                if(ct==2){
                    System.out.print("AC");
                    return;
                }
            }
        }
        System.out.print("WA");
    }
}