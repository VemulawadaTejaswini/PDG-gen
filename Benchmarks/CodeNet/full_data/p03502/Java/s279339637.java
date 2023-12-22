import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int x = Integer.parseInt(input);
        char[] array = input.toCharArray();
        int sum = 0;

        for(char c: array){
            int i = Integer.parseInt(String.valueOf(c));
            sum += i;
        }

        if(x % sum == 0){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static void printListOneLine(List list){
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }

    public static void printList(List list){
        for(int i=0; i<list.size(); i++){
            if(i == list.size()){
                System.out.println(list.get(i));
            } else {
                System.out.print(String.format("%d ", list.get(i)));
            }
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

    public static int gcd(int a, int b){
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static int lcm(int a, int b){
        return a * b / gcd(a, b);
    }
}
