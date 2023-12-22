import java.util.*;
 

public class Main {
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        
        if(N.contains("000")||N.contains("111")||N.contains("222")||N.contains("333")||N.contains("444")||N.contains("555")||N.contains("666")||N.contains("777")||N.contains("888")||N.contains("999")){
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }
		
    }
}

