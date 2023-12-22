import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        List<Integer> lengthList = new ArrayList<>(n);

        for (int i=0; i<n; i++){
            lengthList.add(sc.nextInt());
        }

        int boundCount = 1;
        int zahyou = 0;

        for (int i=0; i<n; i++){
            zahyou += lengthList.get(i);

            if (zahyou <= x){
                boundCount++;
            }else {
                break;
            }
        }

        System.out.println(boundCount);

    }
}