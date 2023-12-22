import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.List;
import java.util.ArrayList;

public class Main{
    public static void main(String args[]){
        int N = 0;
        List<Integer> input_int = new ArrayList<Integer>();
        try{
            Scanner scanner = new Scanner(System.in);
            N = scanner.nextInt();
            Scanner scanner_2 = new Scanner(System.in);
            String input_str[] = scanner_2.nextLine().split(" ");

            for(String str : input_str){
                input_int.add(Integer.parseInt(str));
            }
            scanner.close();
            scanner_2.close();
        } catch(InputMismatchException e){
            System.out.println(e);
        }
        int output = 1;
        int end_index = N - 1;
        int indexOfMax = N;
        while(indexOfMax != 0){
            indexOfMax = findMax(input_int, end_index);
            if(input_int.get(indexOfMax) >= input_int.get(0) && indexOfMax != 0){
                output++;
                end_index = indexOfMax - 1;
            }
            else{
                break;
            }
        }
        System.out.println(output);

    }

    public static int findMax(List<Integer> input, int end_index){
        int max = 0;
        int index = 0;
        for(int i = 0; i <= end_index; i++){
            if(input.get(i) >= max){
                max = input.get(i);
                index = i;
            }
        }
        return index;
    }
}