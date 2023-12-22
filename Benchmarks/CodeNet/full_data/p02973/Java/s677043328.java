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
        Collections.sort(list);
        int result = 0;
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i) == list.get(i+1)){
                result++;
            }
        }
        System.out.println(result);
    }
}