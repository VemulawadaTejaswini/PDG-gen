import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        char[] input_text = sc.nextLine().toCharArray();
        
        for (int i = 0; i < input_text.length; i++) {
            switch (input_text[i]){
                case '1':
                    input_text[i] = '9';
                    break;
                case '9':
                    input_text[i] = '1';
                    break;
            }
        }
        
        String output_text = new String(input_text);
        System.out.println(output_text);
    }
}
