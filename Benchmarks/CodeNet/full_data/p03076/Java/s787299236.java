import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int [] Dish = new int [5];
        for(int i =0; i<5;i++){
            Dish[i] = scanner.nextInt();
        }

        int time = 0;
        int min = Dish[0];
        
        for(int j=1; j<5; j++){
            
            if(Dish[j]% 10 == 0){
                continue;
            }
            
            else if((min%10)>(Dish[j] % 10)){
                    min = Dish[j];
            }
        }
        
        min = 10-(min%10);
        
        for(int k=0; k<5;k++){
            time += Dish[k]+(10-(Dish[k]%10));
        }
        
        System.out.println(time-min);
        
    }    
}