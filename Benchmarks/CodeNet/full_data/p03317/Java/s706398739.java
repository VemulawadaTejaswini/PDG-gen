import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        execute();
    }

    private static void execute() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine().split(" ")[1]);
        List<Integer> nums = Arrays.stream(br.readLine().    split(" "))
                .map(s -> Integer.parseInt(s)).collect(Collectors.toList());
        System.out.println(getMinimizeOperationCount(k, nums));
    }

    protected static int getMinimizeOperationCount(int k, List<Integer> nums) {
        int minIndex = nums.indexOf(1);
        int changeableNum = k - 1;
        int operation = 0;
        operation += getOperationCount(minIndex, changeableNum);
        if (changeableNum - minIndex > 0 && minIndex != 0) {
            minIndex = changeableNum;
        } else if (nums.size() - minIndex - minIndex % changeableNum - 1 <= 0){
            return operation;
        }
        operation += getOperationCount(nums.size() - minIndex - 1, changeableNum);
        return operation;
    }

    protected static int getOperationCount(int nums, int changableNum) {
        int operation = 0;
        operation += nums / changableNum;
        if (nums % changableNum != 0) {
            operation++;
        }
        return operation;
    }
}