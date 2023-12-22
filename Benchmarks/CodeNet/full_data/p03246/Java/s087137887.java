import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        
        List<int> intlist = new List<int>();
        
        for(int i = 0; i < N; i++) {
            intList.add(sc.nextInt());
        }
        
        for(int i = 0; i < N; i++) {
            if(intList.get(i) != intList.get(i+2)) {
                count++;
            }
        }
        
        System.out.print(count);
    }

}

