import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        FastReader read = new FastReader();
        int n = read.nextInt();
        int m = read.nextInt();
        List<Integer> array = new ArrayList<Integer>();
         PriorityQueue<Integer> q = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int i = 0; i<n; i++){
            array.add(read.nextInt());
            q.add(array.get(i));
        }
        Collections.sort(array);
        for(int i = 0; i<m;i++){
           array.add(array.get(n-1)/2);
           array.remove(n-1);
           q.remove();
           q.add(array.get(n-1));
           array.add(q.peek());
           if(q.peek() == array.get(n-1)){
               array.remove(n-1);
           }
           else{
               array.remove(n-2);
           }
//           if(i == m-1){
//               array.remove(n-1);
//           }
//           int lo = 0;
//           int hi = n-2;
//           int mid = 0;
//           System.out.println(array.toString());
//           while(lo<=hi){
//            mid = lo + (hi -lo)/2;
//            if(array.get(n-1) == array.get(mid)){
//                break;
//            }
//            else if(array.get(n-1)>array.get(mid)){
//                lo = mid;
//                if(array.get(n-1)>array.get(mid+1)){
//                    lo++;
//                }
//                else{
//                    break;
//                }
//            }
//            else{
//                hi = mid - 1;
//            }
//            } 
//           array.add(mid + 1,array.get(n-1));
//           array.remove(n);
////           System.out.println("Sorted: " + array.toString());
        }
        long sum1 = 0;
        long sum2 = 0;
//        for(int i = 0; i<n; i++){
//            sum1+= array.get(i);
//        }
//        System.out.println(sum1);
        while (!q.isEmpty()) {
            int t = q.remove();
            sum2 += t;
        }
        System.out.println(sum2);
    }
        static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    }  
    } 
    
