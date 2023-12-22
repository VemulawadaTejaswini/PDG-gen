import java.util.Scanner;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String[] s = new String[n];
    int[] p = new int[n];
    int[] ans = new int[n];
    for(int i=0;i<n;i++){
      s[i]=sc.next();
      p[i]=sc.nextInt();
    } 
    String[] res = check1(s);
    for(int i=0;i<res.length;i++){
      ArrayList<Integer> intList = new ArrayList<Integer>();
      ArrayList<Integer> intList1 = new ArrayList<Integer>();
      for(int j=0;j<n;j++){
        if(res[i].equals(s[j])){
          intList.add(p[j]);
          intList1.add(j);
        }
      }
      Collections.sort(intList, Collections.reverseOrder());
      for(int m=0;m<intList.size();m++){
      	for(int l=0;l<intList.size();l++){
        	if(p[intList1.get(l)]==intList.get(m)){
          	System.out.println(intList1.get(l)+1);
            }
        }
      }
    }   
  }  
 
  static String[] check1(String[] s){
    Set<String> linkedHashSet = new LinkedHashSet<String>();
    for (int i=0;i<s.length; i++) {
      linkedHashSet.add(s[i]);
    }
    Object[] s_after = linkedHashSet.toArray();
    Arrays.sort(s_after); 
    String[] str = new String[s_after.length];
    for(int i=0;i<s_after.length;i++){
      str[i] = s_after[i].toString();
    }    
    return str;
  }

}