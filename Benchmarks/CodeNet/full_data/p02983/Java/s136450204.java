import java.util.*;
import java.util.stream.IntStream;

public class Main
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        int R = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        if(R-L>=2019){
            System.out.println(0);
        }else{
            for(int i =1 ; i< 2019 ; i++){
                int finalI = i;
                if(IntStream.range(L,R+1).filter(x->x%2019 == finalI).count()!=0){
                    list.add(i);
                    if(list.size()==2){
                        break;
                    }
                }
            }
            System.out.println(list.get(0)*list.get(1));
        }
    }
}
