import java.util.*;

public class Main {
    public static void main(String[] args){
        
        Scanner cin = new Scanner(System.in);
        
        int X = cin.nextInt();
        int A = cin.nextInt();
        int B = cin.nextInt();
        String result;
        if(B<=A){
            result = "delicious";
        }else{
            if(B-A<=X){
                result = "safe";
            }else{
                result ="dangerous";
            }
        }        
        System.out.println(result);
    }
}
