import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String [] numbers = sc.nextLine().split("");
        
        int count = 0;
        
        for(int i = 0 ; i < numbers.length; i++){
            if(numbers[i].equals("1")){
                count++;
            }
        }
        
        System.out.println(count);
    }
}
