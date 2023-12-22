import java.util.Scanner;

import java.util.InputMismatchException;

public class Main{
    public static void main(String args[]){
        int distance[] = new int[5];
        int limit = 0;
        int flag = 0;

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
                    flag = 1;
                }
            }
        }

        if(flag == 1){
            System.out.println(":(");
        }
        else{
            System.out.println("Yay!");
        }
    }
}
