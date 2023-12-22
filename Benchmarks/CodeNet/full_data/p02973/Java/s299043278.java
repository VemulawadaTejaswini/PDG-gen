import java.util.*;
public class Main
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        LinkedList<Integer> list = new LinkedList();
        for(int i=0;i<N;i++){
            list.add(sc.nextInt());
        }
        Iterator<Integer> it = list.iterator();
        int result = 0;
        while(it.hasNext()){
            Iterator<Integer> it2 = list.iterator();
            int num = it.next();
            while(it2.hasNext()){
                int num2 = it2.next();
                if(it == it2){
                    it2.remove();
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}
