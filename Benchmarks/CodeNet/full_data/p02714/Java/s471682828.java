
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String  s = sc.next();
        char[] rgb = s.toCharArray();
        int result = 0;
        for (int i = 0; i < rgb.length; i++){
            for (int j = i + 1; j < rgb.length; j++){
                for (int k = j + 1; k < rgb.length; k++){
                    if (rgb[i] != rgb[j] && rgb[j] != rgb[k] && rgb[k] != rgb[i]){
                        if(j - i != k - j){
                            result++;
                        }
                    }
                }
            }
        }
        System.out.println(result);

    }
}
