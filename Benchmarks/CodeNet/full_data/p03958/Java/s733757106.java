import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        List<Integer> list = new LinkedList<>();
        for(int i=0;i<t;i++) {
            list.add(sc.nextInt());
        }
        int days =0;
        Collections.sort(list);
        if(list.get(t-1)>n-list.get(t-1)){
            days = n - list.get(t-1) -1;
        }
        if(t==1){
            days = n-t;
        }

        System.out.println(days);

    }

 }
