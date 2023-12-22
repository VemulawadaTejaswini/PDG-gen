import java.util.*;
public class Main {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N,K;
    N= sc.nextInt();
    K = sc.nextInt();
    ArrayList<Integer> list = new ArrayList<Integer>();
    ArrayList<Integer> list2 = new ArrayList<Integer>();
    for(int a=0;a<N;a++){
        int ai = sc.nextInt();
        int bi = sc.nextInt();
       list.add(ai);
       list2.add(bi);
    }
    int min_num=0;
    for(int a=K;a>0;a--){
        min_num =Collections.min(list);
        int nth=0;
        for(int b=0;b<list.size();b++){
            if(min_num == list.get(b)){
                nth =b;
                list.set(b,1000000000);
                a=a-list2.get(b);
                break;

            }
        }

    }
    System.out.println(min_num);
}
}