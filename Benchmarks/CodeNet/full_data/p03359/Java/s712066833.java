import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());

        String ab = String.valueOf(a) + String.valueOf(b);
        int abInt = Integer.parseInt(ab);

        int[] intArray = {11, 22, 33, 44, 55, 66, 77, 88, 99, 1010, 1111, 1212};

        int count =0;

        for(int i: intArray){
            if(i <= abInt){
                count++;
            }
        }

        System.out.println(count);
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
