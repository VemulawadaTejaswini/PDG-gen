import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = String.valueOf(sc.next().charAt(0)).toUpperCase();
        String b = String.valueOf(sc.next().charAt(0)).toUpperCase();
        String c = String.valueOf(sc.next().charAt(0)).toUpperCase();

        System.out.println(a + b + c);
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
