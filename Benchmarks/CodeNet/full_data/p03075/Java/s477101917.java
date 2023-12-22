import java.util.Scanner;

import java.util.InputMismatchException;

public class main{
    public static void main(String args[]){
        int distance[] = new int[5];
        int limit = 0;

        try{
            Scanner scanner = new Scanner(System.in);
            for(int i = 0; i < distance.length; i++){
                distance[i] = scanner.nextInt();
            }
            limit = scanner.nextInt();
            scanner.close();
        } catch(InputMismatchException e){
            System.out.println(e);
        }

        for(int i = distance.length - 1; i >= 0; i--){
            for(int j = i - 1; j >= 0; j--){
                if(distance[i] - distance[j] > limit){
                    System.out.println(":(");
                    System.exit(1);
                }
            }
        }
        System.out.println("Yay!");
    }
}
