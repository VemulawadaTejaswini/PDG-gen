

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Pr_5 {

    public static void main(String[] args) {
        FastReader f = new FastReader();
        // int [] arr = { 1 , 6 , 120 , 496 , 2016, 8128 ,32640 , 130816};
        
        String s = f.next();
        byte aCounter=0 , bCounter=0 , cCounter=0;
        for(byte i =0;i<3 ; i++){
            switch(s.charAt(i)){
                case'a':
                    aCounter++;
                    break;
                case'b':
                    bCounter++;
                    break;
                case'c':
                    cCounter++;
                    break;
            }
        }
        if(aCounter!=0 && bCounter!=0 && cCounter!=0)System.out.println("Yes");
        else { System.out.println("No");}
    
}

     
     
     
 }

// }
//    public static int bin(int [] arr,int num){
//        int low=0;
//        int high = arr.length;
//        int res=-1;
//        int mid=0;
//        while(low<=high){
//            
//             mid=(low+high)/2;
//            if(arr[mid]==num){  res=mid+1;  arr[mid]=0;  }
//           else if(arr[mid] < num){ low=mid+1; }
//           else if(arr[mid]>num && arr[mid-1] <num){ high=mid-1;  res=mid+1; arr[mid]=0;}
//           else{ high=mid-1;}
//        }
//        return res;
//    }
//        
//        
//}


class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new InputStreamReader(System.in)); 
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
  
        byte nextByte() 
        { 
            return Byte.parseByte(next()); 
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
