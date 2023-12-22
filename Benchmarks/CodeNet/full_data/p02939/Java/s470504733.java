import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        String S = sc.next();
        sc.close();

        int index = 0;
        int count = 0;
        if(S.length() == 1){
            count = 1;
        } else{
            while(index < S.length()-1){
                if(S.charAt(index) != S.charAt(index+1)){
                    index++;
                    count++;
                    if(index == S.length()-1)
                        count++;
                } else {
                    if(index != S.length()-2) {
                        count += 2;
                        index += 3;
                    } else {
                        count++;
                        index += 2;
                    }
                }
            }
        }
        System.out.println(count);
    }
}