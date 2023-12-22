import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        long gate_num = Long.valueOf(input[1]);

        long gate_min = Long.MIN_VALUE;
        long gate_max = Long.MAX_VALUE;

        for(int i = 0; i < gate_num; i++) {
            String[] allow_gate = scanner.nextLine().split(" ");
            long min = Long.valueOf(allow_gate[0]);
            long max = Long.valueOf(allow_gate[1]);

            if(min > gate_min) gate_min = min;
            if(max < gate_max) gate_max = max;
        }
        System.out.println(gate_max - gate_min + 1);
    }
}