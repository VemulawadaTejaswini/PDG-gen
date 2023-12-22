import java.util.*;

public class Main {
    public static void main(String[] args){
       
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), blue = sc.nextInt(), red = sc.nextInt();
        
        int count = n / (blue + red);
        int result = 0;
        for(int i=0;i<count;i++){
            result += blue;
        }
        
        int rem = n % (blue + red); 
        if(rem > 0){
            result += rem; 
        }
        System.out.println(result);
    }
}
