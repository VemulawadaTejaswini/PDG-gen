import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        String S = sc.next();
        sc.close();

        String[] s = new String[S.length()];
        for(int i = 0; i < S.length(); i++){
            s[i] = String.valueOf(S.charAt(i));
        }

        int index = 0;
        int count = 0;
        while(index < S.length()-1){
            if(s[index].equals(s[index+1])){
                
                index++;
            }
            index++;
            count++;
        }
        System.out.println(count+1);
    }
}