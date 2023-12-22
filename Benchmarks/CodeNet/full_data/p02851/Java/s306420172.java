import java.util.*;
public class Main{
  public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int k = input.nextInt();
    int[] a = new int[n];
    for(int i=0;i<n;i++)
        a[i] = input.nextInt();
    
    System.out.println(printSubsets(a,k));
    
  }
   public static int printSubsets(int set[],int K) 
    { 
        int n = set.length; 
        int g = 0;
        for (int i = 0; i < set.length; i++) 
        { 
            
            for (int j = i; j <=set.length ; j++) {
                ArrayList<Integer> list = new ArrayList<>();
                int sum = 0;
                for (int k = i ; k < j ; k++) {
                    list.add(set[k]);
                    }
                if(list.size()==0)
                    continue;
                else{
                    for(int l=0;l<list.size();l++)
                        sum+=list.get(l);
                    if(sum%K==list.size()){
                        g++;
                        //System.out.println(list);
                    }
                    else
                        continue;
                }
            }
        }
        
        return g;
    } 
}