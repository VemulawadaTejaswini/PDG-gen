import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String p = "";
        String q = "";
        for(int i = 0;i<n;i++){
            p += sc.next();
        }
        for(int i = 0;i<n;i++){
            q += sc.next();
        }
        List<String> list = new ArrayList<>();
        permutation(p,"",list);
        Collections.sort(list);
        int a = list.indexOf(p)+1;
        int b = list.indexOf(q)+1;
        System.out.println(Math.abs(a-b));
    }
    public static void permutation(String q, String ans,List<String> list){
        // Base Case
        if(q.length() <= 1) {
            list.add(ans+q);
        }
        // General Case
        else {
            for (int i = 0; i < q.length(); i++) {
                permutation(q.substring(0, i) + q.substring(i + 1),
                        ans + q.charAt(i),list);
            }
        }
    }
}