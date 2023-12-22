import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        List<Integer> x=new ArrayList<Integer>();
        int n=scanner.nextInt();
        for(int i=0;i<n;i++){
            x.add(scanner.nextInt());
        }
        int color=1;
        for(int j=1;j<n;j++){
            List<Integer> arrlist2 = x.subList(0,j);
           int z= Collections.min(arrlist2);
           if(z>=x.get(j))
               color++;
        }
        System.out.println(color);



    }
}
