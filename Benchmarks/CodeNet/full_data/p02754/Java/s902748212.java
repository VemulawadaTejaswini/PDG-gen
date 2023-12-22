import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
       
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong(), blue = sc.nextLong(), red = sc.nextLong();
        
        long count = n / (blue + red);
        long result = 0;
        for(long i=0;i<count;i++){
            result += blue;
        }
        
        long rem = n % (blue + red); 
        if(rem > 0){
            result += rem; 
        }
        System.out.println(result);
    }
}
