import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        char[] tmp = s.toCharArray();
        
        for(int i=0; i<tmp.length; i++){
            int j = n;
            while(j > 0){
                if(tmp[i] == 'Z'){
                    tmp[i] = 'A';
                }
                else{
                    tmp[i] = (char)(tmp[i]+1);
                }
                j--;
            }
        }
        
        for(char c : tmp){
            System.out.print(c);
        }
    }
}