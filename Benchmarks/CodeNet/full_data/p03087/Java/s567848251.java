import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        char[] s = sc.next().toCharArray();
        int[] ac = new int[n];
        ArrayList<Integer> acl = new ArrayList<>();
        int i = 1;
        boolean prevA = false;
        for(char c : s){
            if(c == 'A'){
                prevA = true;
            }else if(c == 'C' && prevA){
                ac[i-1]++;
                prevA = false;
            }else{
                prevA = true;
            }
            i++;
        }
        for(int j = 1; j < n; j++){
            ac[j] += ac[j-1];
        }
        for(int j = 0; j < q; j++){
            int left = sc.nextInt()-1;
            int right = sc.nextInt()-1;
            System.out.println(ac[right] - ac[left]);
        }
    }
}