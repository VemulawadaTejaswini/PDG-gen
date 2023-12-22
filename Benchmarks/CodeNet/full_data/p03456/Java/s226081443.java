import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        
        String input = Integer.toString(a) + Integer.toString(b);
        int value = Integer.parseInt(input);
        double sqrt = Math.floor(Math.sqrt(value));
        
        if(value == Math.pow(sqrt, 2)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}