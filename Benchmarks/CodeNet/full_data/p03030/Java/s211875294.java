import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        int N  = sc.nextInt();
      
        Map<Integer,String> m = new TreeMap<>(new Comparator<Integer>(){
           public int compare(Integer m , Integer n){
             return((Integer)m).compareTo(n) *-1;
           }
        });
      
        String[] shop01 = new String[N];
        int[] score01 = new int[N];
        
         for(int i = 0; i < N ; i++){
           shop01[i] = sc.next();
           score01[i] = sc.nextInt();
         }
          
        for(int i = 0; i < N ; i++){
           m.put(score01[i],shop01[i]);
        }
         
        String[] shop02 = shop01.clone();
        Arrays.sort(shop01);
      
       List<Integer> ans = new ArrayList<>();
       for(int i = 0; i < N ; i++){
         String same = shop01[i];
         for(Map.Entry<Integer,String> m1 : m.entrySet()){
           if(same.equals(m1.getValue())){
             int num = m1.getKey();
             for(int j = 0; j < N ; j++){
               if(score01[j] == num){
                 ans.add(j+1);
               }
             }
           }
         }
       }
      
      List<Integer> answer = ans.stream().distinct().collect(Collectors.toList());
      for(int i = 0; i < N; i++){
        System.out.println(answer.get(i));
      }
      
	}
}