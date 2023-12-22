import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] strArray = line.split(" ");
        int x = Integer.valueOf(strArray[0]);
        int y = Integer.valueOf(strArray[1]);
        int buttonBCount = 0;

        if(x < 0 && y < 0 ||
           x > 0 && y > 0){
            if(x > y){
                buttonBCount = 2;
            }
        }else if(x < 0 && y > 0 && Math.abs(x) == Math.abs(y) ||
                x < 0 && y == 0 ||
                x == 0 && y > 0){
            buttonBCount = 0;
        }else{
            buttonBCount = 1;
        }
        System.out.println(Math.abs(Math.abs(x)-Math.abs(y)) + buttonBCount);
    }
}