import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a == 1){
            a = 14;
        }

        if(b == 1){
            b = 14;
        }

        if(a > b){
            System.out.println("Alice");
        } else if(b > a){
            System.out.println("Bob");
        } else {
            System.out.println("Draw");
        }
    }

    public static void printArray(int[] array){
        for(int i=0; i<array.length; i++){
            if(i == array.length){
                System.out.println(array[i]);
            } else {
                System.out.print(String.format("%d ", array[i]));
            }
        }
    }
}
