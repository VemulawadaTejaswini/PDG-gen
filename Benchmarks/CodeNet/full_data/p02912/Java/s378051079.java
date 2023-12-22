import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int m = read.nextInt();
        List<Integer> array = new ArrayList<Integer>();
        for(int i = 0; i<n; i++){
            array.add(read.nextInt());
        }
        Collections.sort(array);
        for(int i = 0; i<m;i++){
           array.add(array.get(n-1)/2);
           array.remove(n-1);
           int lo = 0;
           int hi = n-2;
           int mid = 0;
//           System.out.println(array.toString());
           while(lo<=hi){
            mid = lo + (hi -lo)/2;
            if(array.get(n-1) == array.get(mid)){
                break;
            }
            else if(array.get(n-1)>array.get(mid)){
                lo = mid;
                if(array.get(n-1)>array.get(mid+1)){
                    lo++;
                }
                else{
                    break;
                }
            }
            else{
                hi = mid - 1;
            }
            } 
           array.add(mid + 1,array.get(n-1));
           array.remove(n);
//           System.out.println("Sorted: " + array.toString());
        }
        long sum = 0;
        for(int i = 0; i<n; i++){
            sum+= array.get(i);
        }
        System.out.println(sum);
    }
    
}
