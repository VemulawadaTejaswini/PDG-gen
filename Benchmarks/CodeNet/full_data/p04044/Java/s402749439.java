import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scanIn = new Scanner(System.in);
        int l = scanIn.nextInt();
        int n = scanIn.nextInt();

        TreeSet<String> array = new TreeSet<String>();
        String[] stringArray = new String[l];

        for(int i = 0; i < n; i++){
            stringArray[i] = scanIn.next();
            array.add(stringArray[i]);
        }

        for(String string : array){
            System.out.print(string);
        }
    }
}
