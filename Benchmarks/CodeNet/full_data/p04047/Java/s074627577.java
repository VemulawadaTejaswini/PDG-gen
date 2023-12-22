package javaapplication1;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
        int count = sc.nextInt();
        ArrayList<Integer> data = new ArrayList<>();
        for (int i = 1; i <= count*2; i++) {
            data.add(sc.nextInt());
        }
        List<Integer> sorted = data.stream().collect(Collectors.toList());
        sorted.sort(Comparator.reverseOrder());
        int j=1;
        int sum=0;
        for(Integer s:sorted){
            if(j%2==0)
                sum=sum+s;
            j++;
        }
        System.out.println(sum);
    }
}
