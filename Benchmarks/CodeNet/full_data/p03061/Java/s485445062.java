import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> valueList = new ArrayList<>();
        for (int i=0; i<n; i++){
            valueList.add(sc.nextInt());
        }

        if (n == 2){
            System.out.println(Math.max(valueList.get(0), valueList.get(1)));
        }else {
            Set<Integer> gcmList = new HashSet<>();
            for (int i=0; i<n; i++){
                List<Integer> targetValueList = new ArrayList<>(valueList);
                targetValueList.remove(i);
                int gcm = targetValueList.get(0);

                for (int j=1; j<n-1; j++){
                    gcm = getGCM(gcm, targetValueList.get(j));
                }

                gcmList.add(gcm);
            }

            System.out.println(gcmList.stream().max(Comparator.naturalOrder()).get());
        }
    }

    private static int getGCM(int a, int b){
        int larger = Math.max(a, b);
        int gcm = Math.min(a, b);

        while (larger % gcm != 0){
            int smaller = gcm;
            gcm = larger % gcm;
            larger = smaller;
        }

        return gcm;
    }
}