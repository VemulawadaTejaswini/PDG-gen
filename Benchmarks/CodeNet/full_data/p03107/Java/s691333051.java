import java.util.Queue;
import java.util.ArrayDeque;
import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        // input
        String input = scan.next();
        char[] inputChar = input.toCharArray();
        Queue<Character> cube = new ArrayDeque<>();
        for(int i = 0; i < inputChar.length; i++){
            cube.add(inputChar[i]);
        }

        // search
        int count = 0;
        int breakCount = 0;
        int border = inputChar.length;
        while(cube.size() > 1){
            char temp = cube.poll();
            if((temp == '0' && cube.peek() == '1') || (temp == '1' && cube.peek() == '0' )){
                cube.poll();
                count += 2;
                breakCount = 0;
                border -= 2;
            } else {
                cube.add(temp);
                breakCount++;
            }

            if(breakCount >= border){
                break;
            }
        }

        // answer
        System.out.println(count);

    }
}