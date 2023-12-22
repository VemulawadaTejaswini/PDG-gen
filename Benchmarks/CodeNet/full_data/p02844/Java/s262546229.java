import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        Set<String> results = new HashSet<>();
        for(int i = 0 ; i < n ; i++){
            for(int j = i ; j < n ; j++){
                for(int k = j ; k < n ; k++){
                    if(i == j || i == k || j ==k){
                        continue;
                    }
                    if(i > j || i > k || j > k){
                        continue;
                    }
                    String pin = String.valueOf(s.charAt(i)) + String.valueOf(s.charAt(j)) + String.valueOf(s.charAt(k));
                    results.add(pin);
                }
            }
        }
        System.out.println(results.size());
    }

}
