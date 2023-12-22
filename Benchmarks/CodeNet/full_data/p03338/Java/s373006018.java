import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] array = sc.next().toCharArray();
        int max = 0;

        for(int i=0; i<array.length; i++){
            Map<String, Integer> left = new HashMap<>();
            Map<String, Integer> right = new HashMap<>();
            Map<String, Integer> ans = new HashMap<>();
            for(int j=0; j<array.length; j++){
                String s = String.valueOf(array[j]);
                if(j<=i){
                    if(left.containsKey(s)){
                        left.put(s, left.get(s) + 1);
                    } else {
                        left.put(s, 1);
                    }
                } else {
                    if(right.containsKey(s)){
                        right.put(s, right.get(s) + 1);
                    } else {
                        right.put(s, 1);
                    }
                }
            }

            for(String strLeft: left.keySet()){
                for(String strRight: right.keySet()){
                    if(strLeft.equals(strRight)){
                        if(ans.containsKey(strLeft)){
                            ans.put(strLeft, ans.get(strLeft)+1);
                        } else {
                            ans.put(strLeft, 1);
                        }
                    }
                }
            }

            if(max < ans.keySet().size()){
                max = ans.keySet().size();
            }
        }

        System.out.println(max);
    }

    public static void printArray(int[] array){
        for(int i=0; i<array.length; i++){
            if(i == array.length){
                System.out.println(array[i]);
            } else {
                System.out.print(String.format("%d ", array[i]));
            }
        }
    }

    public static int gcd(int a, int b){
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static int lcm(int a, int b){
        return a * b / gcd(a, b);
    }
}
