import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner scanner =  new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();
        List<Integer> list = Arrays.asList(first,second,third);

        int count5 = 0;
        int count7 = 0;
        for (int value : list) {
            if (value == 5) {
                count5++;
            }
            if(value == 7) {
                count7 ++;
            }
        }
        if (count5 == 2 && count7 == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }


    }
}