import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        for(int i = 0;i < n;i++){
            char[] ca = sc.next().toCharArray();
            int hash = 0;
            for(int j = 0;j < 10;j++){
                hash += ca[j];
            }
            list.add(hash);
        }

        Collections.sort(list);

        long ans = 0;
        for(int i = 0;i < n;i++){
            int count = 1;
            for(int j = i+1;j < n;j++){
                if(list.get(i).intValue() == list.get(j).intValue()){
                    count++;
                } else {
                    i = j-1;
                    break;
                }
            }
            ans += (count * (count - 1) )/2;
        }
        System.out.println(ans);
    }
}


