import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String[] lines = getStdin();
        
        String[] input = lines[0].split(" ");
        int x = Integer.parseInt(input[0]);
        int a = Integer.parseInt(input[1]);
        
        if (x < a){
            System.out.println("0");
        }
        else if (x >= a){
            System.out.println("10");
        }     
    }
    
    private static String[] getStdin() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lines = new ArrayList<>();
        while (scanner.hasNext()) {
            lines.add(scanner.nextLine());
        }
        return lines.toArray(new String[lines.size()]);
    }
}