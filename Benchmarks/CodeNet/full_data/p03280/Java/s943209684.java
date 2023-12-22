import java.util.*;

public class Main {

    

    public static void main(String[] atgs){

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int num = Integer.parseInt(input);
      	int count = 0;
        
        for(int i = 1; i <= num; i+=2){
            if(ishave(i))
                count++;
        }

        System.out.println(count);
    }

    private static boolean ishave(int n){
        int divisotCount = 0;
        for(int i = 1; i <= n; i++){
            if((n % i) == 0)
                divisotCount++;
        }

      	
        if(divisotCount == 8)
            return true;
        else return false;
    }
}