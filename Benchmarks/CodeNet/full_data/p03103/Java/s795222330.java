import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        List<String> shopList = new ArrayList<String>();
        for (int i=0; i<N; i++) {
            shopList.add(sc.nextLong() + "," + sc.nextLong());
        }
        Collections.sort(shopList);
        Long kingaku = 0L;
        for (String sp : shopList) {
            //System.out.println(sp);
            if (M == 0) {
                break;
            }
            String[] strArray  = sp.split(",");
            Long A = Long.parseLong(strArray[0]);
            Long B = Long.parseLong(strArray[1]);

            if (M <= B) {
                kingaku += A * M;
                M -= M;
            }
            else {
                kingaku += A * B;
                M -= B;
            }

        }
        System.out.println(kingaku);
    }

}
