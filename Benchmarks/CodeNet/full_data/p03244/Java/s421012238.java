import java.util.Scanner;
import java.util.LinkedList;
import java.util.Collections;
import java.util.Comparator;

public class Main{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // input
        final int NUM = scan.nextInt();
        int[] counts = new int[100001];
        for(int i = 0; i < NUM; i++){
            counts[scan.nextInt()] += 1;
        }

        // search
        LinkedList<Integer> countList = new LinkedList<>();
        for(int i = 1; i <= 100000; i++){
            if(counts[i] != 0){
                countList.add(counts[i]);
            }
        }
        Collections.sort(countList, Comparator.reverseOrder());
        if(countList.size() >= 3){
            countList.poll();
            countList.poll();
            int sum = 0;
            while(countList.size() > 0){
                sum += countList.poll();
            }
            System.out.println(sum);
        } else if (countList.size() == 2) {
            System.out.println(0);
        } else {
            System.out.println(countList.poll() / 2);
        }
        

    }
}