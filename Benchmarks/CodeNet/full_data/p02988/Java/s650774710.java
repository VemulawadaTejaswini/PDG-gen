import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i<n; i++){
            list.add(sc.nextInt());
        }

        int answer =0;
        for (int i = 0; i < n-2; i++){
            if (secondIsMedium(list.get(i), list.get(i+1), list.get(i+2))){
                answer++;
            }
        }

        System.out.println(answer);
    }

    private static boolean secondIsMedium(int one, int two, int three){
        return (one < two && two < three) || (one > two && two > three);
    }
}