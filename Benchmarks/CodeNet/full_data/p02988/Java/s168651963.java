
import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[]args){
        //System.out.println(second(1,3,5));
        int n ;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        int[] arr = new int[n];
        
        for(int i =0 ; i < n ;i++){
           arr[i] = scan.nextInt();
        }
        ArrayList a = new ArrayList() ;
        int count = 0;
        for(int i = 1 ; i<n-1 ; i++){
            if(second(arr[i-1],arr[i],arr[i+1]) == arr[i-1]){
                if(!a.contains(arr[i-1])){
                    a.add(arr[i-1]);
                    count++;
                }
            }else if(second(arr[i-1],arr[i],arr[i+1]) == arr[i]){
                if(!a.contains(arr[i])){
                    a.add(arr[i]);
                    count++;
                }
            } else {
                
                if(!a.contains(arr[i+1])){
                    a.add(arr[i+1]);
                    count++;
                }
            }
            
            
        }
        
        System.out.println(count);
               
    }
    
    static int second(int x , int y ,int z){
        if( (x<y && y<z ) || x>y && y>z){
            return y ;
        }else if((y<x && x<z) || y>x && x>z ){
            return x ;
        }else 
            return z ;
        }
    }
   
    
