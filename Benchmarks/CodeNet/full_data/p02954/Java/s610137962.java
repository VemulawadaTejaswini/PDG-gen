import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        List<String> list = new ArrayList<>();
        String cur = curState(s, "1".repeat(s.length()));
        while(!list.contains(cur)){
            list.add(cur);
            cur = curState(s, cur);
        }
        for(int i = 0; i < list.indexOf(cur); i++){
            list.remove(0);
        }
        String ans = list.get((int)(Math.pow(10,100)) % list.size());
        for(int i = 0; i < ans.length(); i++){
            System.out.print(ans.charAt(i) + " ");
        }
        System.out.println("\n");
    }
    public static String curState(String dir, String num){
        String ans = "";
        for(int i = 0; i < dir.length(); i++){
            int cur = 0;
            if(i != 0){
                if(dir.charAt(i-1) == 'R'){
                    cur += (num.charAt(i-1) - '0');
                }
            }
            if(i < dir.length()-1){
                if(dir.charAt(i+1) == 'L'){
                    cur += (num.charAt(i+1) - '0');
                }
            }
            ans += String.valueOf(cur);
        }
        return ans;
    }
}

