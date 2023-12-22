
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int N = sc.nextInt();
        for(int i = 0; i<N; i++){
           list.add(sc.nextInt()) ;
        }
        Collections.sort(list);
        
        int sum = 0;
        for(int i : list){
            sum+=i;
            System.out.print(i + " ");
        }
        System.out.println();

        while(true){
            if(!list.isEmpty() && sum%10 == 0){
                sum -= list.get(0);
                list.remove(0);
            }else{
                System.out.println(sum);
                break;
            }

        }

    }

}
