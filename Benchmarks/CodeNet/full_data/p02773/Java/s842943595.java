import java.util.*;
import java.io.*;
 
public class Main{
 
	public static void main(String[] $){
		Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        String[] S = new String[N];
        for(int i = 0; i < N; i++){
            S[i] = s.next();
        }
        HashMap<String, Integer> Hash = new HashMap<String, Integer>();
        int max = 0;
        List<String> list = new ArrayList<String>();
        for(int i = 0; i < N; i++){
            if(Hash.get(S[i]) == null){
                Hash.put(S[i], 1);
                list.add(S[i]);
                max = Math.max(max, 1);
            }else{
                int a = Hash.get(S[i]);
                a++;
                Hash.put(S[i], a);
                max = Math.max(a, max);
            }
        }
        List<String> list2 = new ArrayList<String>();
        for(int i = 0; i < list.size(); i++){
            if(Hash.get(list.get(i)) == max){
                list2.add(list.get(i));
            }
        }

        for(int i = 0; i < list2.size(); i++){
            for(int j = i+1; j < list2.size(); j++){
                if(list2.get(j).compareTo(list2.get(i)) == 1){
                    String ss = list2.get(j);
                    list2.set(j, list2.get(i));
                    list2.set(i, ss);
                }
            }
        }
        
        for(int i = list2.size()-1; i >= 0; i--){
            System.out.println(list2.get(i));
        }
        
	}
} 