import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        // input
        int red = scan.nextInt();
        int green = scan.nextInt();
        int blue = scan.nextInt();
        int border = scan.nextInt();

        // search
        int count = 0;
        for(int r = 0; r <= border; r++){
            for(int g = 0; g <= border; g++){
                if((border - red * r - green * g) % blue == 0 && (border - red * r - green * g) >= 0){
                    count++;
                }
            }
        }

        // answer
        System.out.println(count);


    }
}