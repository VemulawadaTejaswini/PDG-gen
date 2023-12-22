import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("");
        for(int x=0; x<input.length-1; x=x+2){
            if(!(input[x].equals("h") && input[x+1].equals("i"))){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");



    }

}
