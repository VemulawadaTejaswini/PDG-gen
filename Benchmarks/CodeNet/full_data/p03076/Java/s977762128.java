import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] Dish = new int [5];
        int time = 0;
        int max = 0;

        for(int i =0; i<5;i++){
            Dish[i] = scanner.nextInt();
            if(Dish[i]%10 == 0){
                time += Dish[i];
            }
            
            else{
                time += (10-(Dish[i]%10)) + Dish[i];
                
                if(10-(Dish[i]%10)>max){
                    max = 10-(Dish[i]%10);
                }
            }
        }
        
        System.out.println(time-max);
        
    }    
}