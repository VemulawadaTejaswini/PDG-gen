import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<String>();

        int n = sc.nextInt();
        int l = sc.nextInt();

        for(int i = 0; i < n ; i++){
            list.add(sc.next());
            
        }
        
        Collections.sort(list);
        list.stream().forEach(s -> System.out.print(s));

        System.out.println();

    }
}