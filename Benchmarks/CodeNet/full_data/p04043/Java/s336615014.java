import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scanIn = new Scanner(System.in);
        int l = scanIn.nextInt();
        int n = scanIn.nextInt();

        String[] stringArray = new String[l];

        for(int i = 0; i < n; i++){
            stringArray[i] = scanIn.next();
        }
        Arrays.sort(stringArray);

        for(String string : stringArray){
            System.out.print(string);
        }
    }
}
