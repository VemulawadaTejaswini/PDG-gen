import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        char[] s = sc.next().toCharArray();
        ArrayList<Integer> acl = new ArrayList<>();
        int i = 0;
        boolean prevA = false;
        for(char c : s){
            if(c == 'A'){
                prevA = true;
            }else if(c == 'C' && prevA){
                acl.add(i-1);
                prevA = false;
            }else{
                prevA = true;
            }
            i++;
        }
        //System.out.println(acl);
        for(int j = 0; j < q; j++){
            int cnt = 0;
            int left = sc.nextInt()-1;
            int right = sc.nextInt()-1;
            for(int a : acl){
                if(a < left){
                    continue;
                }else if(a+1 > right){
                    break;
                }
                cnt++;
            }
            System.out.println(cnt);
        }
    }
}