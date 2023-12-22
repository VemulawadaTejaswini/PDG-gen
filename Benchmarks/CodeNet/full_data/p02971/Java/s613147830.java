import java.util.*;
public class Main{
  public static void main(String[] args){
    int n = sc.nextInt();
    ArrayList<Integer> arr = new ArrayList<Integer>();
    ArrayList<Integer> arr1 = new ArrayList<Integer>();
    for(int i=0;i<n;i++){
      int a = sc.nextInt();
      arr.add(a);
      arr1.add(a);
    }
    Collections.sort(arr);
    for(int i=0;i<n;i++){
      if(arr1.get(i)==arr.get(arr.size()-1)){
        System.out.println(arr.get(arr.size()-2));
                           }
      else{
        Ssystem.out.println(arr.get(arr.size()-1));
                            }
                            }
                            
                            }
                            }
                       