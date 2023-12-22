import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Integer[] lines = getStdinInt();
        int five = 0;
        int seven = 0;
        for(int i = 0; i < lines.length; i++){
            if(lines[i] == 5){
                five++;
            }else if(lines[i] == 7){
                seven++;
            }
        }
        if(seven == 1 && five == 2){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }

    private static Integer[] getStdinInt() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> lines = new ArrayList<>();
        while (scanner.hasNext()) {
            lines.add(scanner.nextInt());
        }
        return lines.toArray(new Integer[lines.size()]);
    }
}
