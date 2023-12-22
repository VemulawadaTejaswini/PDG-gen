import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int[] antennas = new int[5];
        int k = 0;
        for(int i = 0; i < 6 && s.hasNextLine(); i++){
            if(i < 5){
                antennas[i] = Integer.parseInt(s.nextLine());
            }else if (i == 5){
                k = Integer.parseInt(s.nextLine());
            }else{
                System.exit(-1);
            }
        }

        if (available(antennas, k)){
            System.out.print("Yay!");
        }else{
            System.out.print(":(");
        }
    }

    public static boolean available(int[] antennas ,int k){
        for(int i = 0; i < antennas.length; i++){
            for(int j = i + 1; j < antennas.length; j++){
                int distance = Math.abs(antennas[i] - antennas[j]);
                if(distance > k){
                    return false;
                }
            }
        }
        return true;
    }
}
