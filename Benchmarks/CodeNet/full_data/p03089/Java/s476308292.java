import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> b_List = new ArrayList<Integer>();
        for(int i = 0; i < N; i++){
            b_List.add(sc.nextInt());
        }
        List<Integer> answer = check(b_List);
        for(int i = answer.size()-1; i>=0; i--){
            System.out.println(answer.get(i));
        }
    }
    
    static List<Integer> check(List<Integer> list){
        List<Integer> list2 = new ArrayList<>(list);
        List<Integer> ans = new ArrayList<Integer>();
        if(list2.isEmpty()){
                return ans;
            }
        for(int i = 0; i < list2.size(); i++){
            if(list.get(i).equals(i+1)){
                ans.add(i+1);
                list2.remove(i);
                ans.addAll(check(list2));
                if(ans.get(ans.size()-1).equals(-1)){
                    ans.clear();
                    list2 = new ArrayList<Integer>(list);
                    continue;
                }
                return ans;
            }

            if(ans.size() == list.size()){
                return ans;
            }
        }
        ans.clear();
        ans.add(-1);
        return ans;
    }
}
