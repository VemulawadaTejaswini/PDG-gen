import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        // 初項を変数に格納する
        int s = console.nextInt();

        List<Integer> numbers = new ArrayList<>();

        // リストに初項を追加
        int lastNum = s;
        int currentNum = s;
        int answer = 0;
        numbers.add(currentNum);

        // 数列をリストに追加していく
        for(int i = 2; i <= 10000; i++){
            if(lastNum % 2 == 0 ){
                currentNum = lastNum / 2;
            }else {
                currentNum = 3 * lastNum + 1;
            }

            if(numbers.contains(currentNum)){
                answer = i;
                break;
            }
            numbers.add(currentNum);
            lastNum = currentNum;
        }

        System.out.println(answer);
    }
}
