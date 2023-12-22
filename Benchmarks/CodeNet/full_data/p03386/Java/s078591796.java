import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = sc.nextInt();
        HashSet<Integer> list = new HashSet<Integer>();

        for(int i =a;i<a+k;i++){
            list.add(i);
            if(i==b)break;
        }
        for(int i = b;i>b-k;i--){
            list.add(i);
            if(i==a)break;
        }

        List<Integer> list2 = new ArrayList<>(list);
        Collections.sort(list2);
        for(int i : list2){
            System.out.println(i);
        }
    }
}
