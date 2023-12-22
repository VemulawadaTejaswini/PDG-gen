import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        for(int i=0; i<n; i++){
            int p = sc.nextInt();
            arrayList.add(p);
        }

        Collections.sort(arrayList);


        int size = arrayList.size();
        int leftHalf = size / 2 - 1;
        int rightHalf = leftHalf + 1;

        if(arrayList.get(leftHalf) == arrayList.get(rightHalf)){
            System.out.println(0);
        }else{
            System.out.println(arrayList.get(rightHalf) - arrayList.get(leftHalf));
        }

    }
}
