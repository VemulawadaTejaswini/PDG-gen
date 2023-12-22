import java.util.*;
import java.lang.*;


public class Main {


    static void impossible(){
        System.out.println("-1");
        System.exit(0);
    }
    static void printList(List<Integer> l){
        int N = l.size();
        int n=0;
        for(int e:l){
            n++;
            System.out.print(e+(n<N ? " " : "\n"));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = 1<<M;
        int K = sc.nextInt();

        if(K>=N) impossible();
        if(M==1&&K==1) impossible();
        if(M==1&&K==0){
            System.out.println("0 0 1 1");
            System.exit(0);
        }

        LinkedList<Integer> list = new LinkedList<>();
        list.add(K);
        for(int n=0; n<N; n++) if(n!=K){
            list.addFirst(n);
            list.addLast(n);
        }
        list.addLast(K);
        printList(list);
    }
}