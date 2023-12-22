import java.util.*;
import java.util.Map.Entry;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Map<String,Integer> poll = new HashMap<String,Integer>();
        int max = 0;
        boolean loop = true;

        for(int i = 0;i < n; i++){
            String str = scan.next();
            if(!poll.containsKey(str)) poll.put(str,1);
            else poll.replace(str, poll.get(str), poll.get(str) + 1);
        }
        scan.close();

        List<Entry<String, Integer>> list_entries = new ArrayList<Entry<String, Integer>>(poll.entrySet());
        Collections.sort(list_entries, new Comparator<Entry<String, Integer>>() {
        public int compare(Entry<String, Integer> obj1, Entry<String, Integer> obj2)
            {
                //降順
                return obj2.getValue().compareTo(obj1.getValue());
            }
        });

        ArrayList<String> result = new ArrayList<String>();

        for(Entry<String, Integer> entry : list_entries) {
            if(loop){
                loop = false;
                max = entry.getValue();
                result.add(entry.getKey());
            }
            else{
                if(!(entry.getValue() == max)) break;
                result.add(entry.getKey());
            }
        }

        Collections.sort(result);

        for(String r : result){
            System.out.println(r);
        }
    }
}