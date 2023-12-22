import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;
        List<String> list = new LinkedList<>();

        for(int i = 0; i < n; i++){
            String str = sc.next();
            for(String item: list){
                if(isAnagram(str, item)){
                    count++;
                }
            }
            list.add(str);
        }

        System.out.println(count);
        
    }
    
    private static boolean isAnagram(String s, String t){
        int[] letters = new int[256];
    
        char[] s_array = s.toCharArray();
        for(char c:s_array){
            letters[c]++;
        }
    
        for(int i=0;i<t.length();i++){
            int c = (int)t.charAt(i);
            if(--letters[c] < 0){
                return false;
            }
        }
        return true;
    }
}