import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                String h = scan.next();
                
    String[] array = h.split("");
    
    for(int i = 0; i < 3; i++) {
      if(array[i].equals(array[i+1])){
        System.out.println("Yes");
        return;
    }
    }

    System.out.println("No");
                
        }
}