import java.util.*;

public class Main {

    
    public static void main(String[] args) {
        
        try(Scanner scanner = new Scanner(System.in)){

            String line = scanner.next();
            int cnt = 0;
            int length = line.length();
            for(int i = 0; i < length / 2; i++){
                if(!line.substring(i, i+1).equals(line.substring(length - (i + 1), length - i))){
                    cnt++;
                }
            }
            
            System.out.println(cnt);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
