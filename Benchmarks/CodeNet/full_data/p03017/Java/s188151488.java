import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
       
        int n = stdIn.nextInt();
        int a = stdIn.nextInt();
        int b = stdIn.nextInt();
        int c = stdIn.nextInt();
        int d = stdIn.nextInt();
        
        boolean flag = true;
        
        String s = stdIn.next();
        char trout[] = s.toCharArray();
        
        for(int i = a; i < b && i < d; i++){
                if(trout[i] == '#' && trout[i + 1] == '#'){
                    flag = false;
                    break;
                }
        }
        
        if(c > d && flag){
            for(int i = b; i < c && i < d; i++){
                if(trout[i] == '#' && trout[i + 1] == '#'){
                    flag = false;
                    break;
                }
                
                if(trout.length - 2 <= i){
                    flag = false;
                    break;
                }
                
                if(trout[i] == '.' && trout[i + 1] == '.' && trout[i + 2] == '.'){
                    break;
                }
                
                if(i == c && c < b){
                    i = b - 1;
                }
            }
        }else if(flag){
            for(int i = b; i < c && i < d; i++){
                if(trout[i] == '#' && trout[i + 1] == '#'){
                    flag = false;
                    break;
                }
                
                if(i == c && c < b){
                    i = b - 1;
                }
            }
        }
        
        if(flag){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
