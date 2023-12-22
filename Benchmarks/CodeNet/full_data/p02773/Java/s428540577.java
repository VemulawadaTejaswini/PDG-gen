import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String,Integer> hash = new HashMap<>();
        int n =sc.nextInt();
        for (int i=0;i<n;i++){
            String s = sc.next();
            if (hash.containsKey(s)){
                hash.put(s,hash.get(s)+1);
            }else {
                hash.put(s,1);
            }
        }
        int max = Collections.max(hash.values());
        ArrayList<String> st  = new ArrayList<>();
        for (Map.Entry entry : hash.entrySet()){
            if ((int)entry.getValue()==max)st.add((String) entry.getKey());
        }
        Collections.sort(st);
        for (int i=0;i<st.size();i++)System.out.println(st.get(i));
    }