import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int hp = sc.nextInt();
        int kind = sc.nextInt();
        int deathblow[] = new int[kind]; 
        for(int i = 0; i < kind; i++){
        	deathblow[i] = sc.nextInt();
        }
        int offensive = 0;
        for(int i = 0; i < kind; i++){
        	offensive += deathblow[i];
        }
        if(offensive >= hp){
        	System.out.println("Yes");
        }else{
        	System.out.println("No");
        }
    }
}