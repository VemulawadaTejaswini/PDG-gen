import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();
        String s2[] = s1.split("");
        int count = 0;
      
        for(int i =0; i < s2.length; i++){
            if(s2[i].equals("1")){
                count++;
            }
        }

        System.out.println(count);
    }
}
