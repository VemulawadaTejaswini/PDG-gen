import java.util.*;
public class Main {
    
    public static void main(String[] args) throws InterruptedException{
        Scanner sc = new Scanner(System.in);
        
        
        String codefestival = "CODEFESTIVAL2016";
        String query = sc.nextLine();
        
        int mistake = 0;
        
        for(int i = 0;i<16;i++){
            if(codefestival.charAt(i) != query.charAt(i)){
                mistake++;
            }
        }
        System.out.println(mistake);
    }
}