import java.util.Scanner;


public class Main {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        int sankasha = s.nextInt();
        int startPoint = s.nextInt();
        int kaisuu = s.nextInt();

        int[] banme = new int[kaisuu];

        int[] list = new int[sankasha +1];
        for (int i = 1; i < sankasha+1; i++){

            list[i] += startPoint;
        }

        for (int i = 0; i < kaisuu; i++){
            banme[i] += s.nextInt();
            for (int k = 1; k < list.length; k++){
                if(banme[i] == list[k]){
                    continue;
                }
               	list[k] = list[k]-1;
            }
        }

        for (int k = 1; k < list.length; k++){
            if(list[k] > 0){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}