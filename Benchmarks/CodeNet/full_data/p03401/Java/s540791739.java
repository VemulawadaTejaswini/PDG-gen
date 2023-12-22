import java.util.*;

public class Main {

    public static  void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> array = new ArrayList<>();
        for(int i = 0; i < n; i++){
            array.add(scanner.nextInt());
        }
        int count = 0;
        int pre = 0;
        for(int i = 0; i < n; i++){
            count += Math.abs(array.get(i) - pre);
            pre = array.get(i);
        }
        count += Math.abs(array.get(array.size()-1));
        //System.out.println(count);

        for(int i = 0; i < n; i++){
            int ans = count;
            if(i == 0){
                ans -= Math.abs(array.get(i));
                ans -= Math.abs(array.get(i) - array.get(i+1));
                ans += Math.abs(array.get(i+1));
            }else if(i == n-1){
                ans -= Math.abs(array.get(i-1) - array.get(i));
                ans -= Math.abs(array.get(i));
                ans += Math.abs(array.get(i-1));
            }else{
                ans -= Math.abs(array.get(i-1) - array.get(i));
                ans -= Math.abs(array.get(i) - array.get(i+1));
                ans += Math.abs(array.get(i-1) - array.get(i+1));
            }
            System.out.println(ans);
        }
    }
}