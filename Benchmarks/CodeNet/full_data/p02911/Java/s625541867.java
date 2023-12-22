import com.sun.javafx.image.IntPixelGetter;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int q = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < q; i++){
            list.add(sc.nextInt());
        }

        Collections.sort(list);
        int index = 0;
        for(int i = 0;i < n;i++){
            if(index < q && list.get(index) == (i+1)){
                int count = 0;
                while(index < q && list.get(index) == (i+1)){
                    index++;
                    count++;
                }
                if(count > q-k){
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            } else {
                if(q < k){
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
        }

    }
}