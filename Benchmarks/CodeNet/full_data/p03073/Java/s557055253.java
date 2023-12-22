import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        List<Integer> colorList = new ArrayList<>();

        for (int i = 0; i < s.length(); i++){
            int value = Character.getNumericValue(s.charAt(i));
            colorList.add(value);
        }

        if (colorList.size() == 1){
            System.out.println(0);
        }else {
            int zeroOne = zeroOne(colorList);
            int oneZero = colorList.size() - zeroOne;

            System.out.println(Math.min(zeroOne, oneZero));
        }
    }

    private static int zeroOne(List<Integer> colorList){
        // 010101010101...なら0が返る

        int updateCount = 0;
        for (int i = 0; i < colorList.size(); i++){
            if (i % 2 == 0){
                // 奇数番目、が0かどうかを検証、0ならそのまま、1ならプラス１
                if (colorList.get(i) == 1){
                    updateCount++;
                }
            }else {
                if (colorList.get(i) == 0){
                    updateCount++;
                }
            }
        }

        return updateCount;
    }
}