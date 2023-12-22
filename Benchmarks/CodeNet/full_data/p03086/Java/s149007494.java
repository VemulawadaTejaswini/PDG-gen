import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String str = sc. nextLine();
        
        char []str_t_char = str.toCharArray();
        
        int count = 0;
        int max_str = 0;
        boolean flag = false;
        
        for (int i = 0; i < str_t_char.length; i++){
            if (str_t_char[i] == 'A' || str_t_char[i] == 'C' || str_t_char[i] == 'G' || str_t_char[i] == 'T'){
                count++;
                flag = true;
            }else{
                flag = false;
            }
            
            if (flag == false){
                if (count > max_str){
                    max_str = count;
                }
                count = 0;
            }
        } 
        
        if (max_str == 1){
            max_str = 0;
        } 
        
        System.out.println(max_str);
    }
}
