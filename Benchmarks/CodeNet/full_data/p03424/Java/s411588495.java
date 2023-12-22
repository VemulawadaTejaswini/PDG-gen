import java.util.ArrayList;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        ArrayList<String> list = new ArrayList<>();

        for(int i=0; i<n; i++){
            String s = scan.next();
            if(!list.contains(s)) list.add(s);
        }
        if(list.size() == 4) System.out.println("Four");
        else System.out.println("Three");
        

        scan.close();
    
    }

}