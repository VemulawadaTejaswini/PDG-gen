import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        execute();
    }

    private static void execute() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] firstLine = br.readLine().split(" ");
        String price  = firstLine[0];
        String[] hateNums = br.readLine().split(" ");
        System.out.println(calcMinPayment(price, hateNums));
    }

    protected static String calcMinPayment(String price, String[] hateNums) {
        List<Integer> availableNums = getAvailableNums(hateNums);

        StringBuilder sb = new StringBuilder(price.length() + 1);
        Integer moveUpIndex = getMoveUpIndex(price, availableNums);
        if (moveUpIndex != null) {
            if (moveUpIndex == -1) {
                for (int i = 0; i < price.toCharArray().length + 1; i++) {
                    sb.append(availableNums.get(0));
                }
                return sb.toString();
            }
            for (int i = 0; i < price.toCharArray().length; i++) {
                if (i > moveUpIndex) {
                    sb.append(availableNums.get(0));
                    continue;
                }
                int value = Character.getNumericValue(price.toCharArray()[i]);
                int first = availableNums.stream().filter(n -> n >= value).findFirst().get();
                if (i == moveUpIndex) {
                    sb.append(availableNums.get(availableNums.indexOf(first) + 1));
                } else {
                    sb.append(first);
                }
            }
            return sb.toString();
        }
        boolean useMinNum = false;
        for (char ch : price.toCharArray()) {
            if (useMinNum) {
                sb.append(availableNums.get(0));
                continue;
            }
            int value = Character.getNumericValue(ch);
            int first = availableNums.stream().filter(i -> i >= value).findFirst().orElse(availableNums.get(0));
            sb.append(first);
            if (availableNums.indexOf(value) == -1) {
                useMinNum = true;
            }
        }
        return sb.toString();
    }

    protected static Integer getMoveUpIndex(String price, List<Integer> availableNums) {
        int isMoveUpIndex = -1;
        int availableMax = availableNums.get(availableNums.size() -1);
        for (int i = 0; i < price.toCharArray().length; i++) {
            int value = Character.getNumericValue(price.toCharArray()[i]);
            // 521
            if (availableNums.indexOf(value) == -1 && value < availableMax) {
                return null;
            }
            if (availableNums.indexOf(value) != -1 && value != availableMax) {
                isMoveUpIndex = i;
            }
            if (value > availableMax) {
                return isMoveUpIndex;
            }
        }
        return null;
    }

    protected static List<Integer> getAvailableNums(String[] hateNums) {
        List<Integer> nums = new LinkedList<>(Arrays.asList(0,1,2,3,4,5,6,7,8,9));
        for (String hateNum : hateNums) {
            int index = nums.indexOf(Integer.parseInt(hateNum));
            if (index != -1) {
                nums.remove(index);
            }
        }
        return nums;
    }
}
