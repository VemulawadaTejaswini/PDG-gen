import java.util.*;

/**
 * Created by DELL on 2017/7/1.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        List<Integer>list=new ArrayList<>();
        List<Integer>list1=new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            list.add(in.nextInt());
        }
        if(n%2==0){
            for (int i = 0; i <n/2 ; i++) {
                list1.add(list.get(n-2*i-1));
            }
            for (int i = 0; i <n/2 ; i++) {
                list1.add(list.get(2*i));
            }
        }
        else{
            for (int i = 0; i <n/2+1 ; i++) {
                list1.add(list.get(n-2*i-1));
            }
            for (int i = 0; i <n/2 ; i++) {
                list1.add(list.get(2*i+1));
            }
        }
        for (int i = 0; i <list1.size() ; i++) {
            System.out.print(list1.get(i)+" ");
        }


    }
}
