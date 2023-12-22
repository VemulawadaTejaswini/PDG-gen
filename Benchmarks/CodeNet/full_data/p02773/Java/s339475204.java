import java.util.*;
 
class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String, Integer> strs = new HashMap<>();
        Integer max = 1;
        for(int i=0;i<n;i++){
            String tmp = sc.next();
            if(strs.containsKey(tmp)){
                Integer p = strs.get(tmp)+1;
                max = max < p ? p : max;
                strs.put(tmp, p);
            }
            else{
                strs.put(tmp, 1);
            }
        }
        List<String> employeeByKey = new ArrayList<>(strs.keySet());
        Collections.sort(employeeByKey);
 
        for(String key : employeeByKey){
            if(strs.get(key)==max){
                System.out.println(key);
            }
        }
    }
}