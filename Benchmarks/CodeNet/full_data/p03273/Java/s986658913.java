  
 
import java.util.Scanner;

  class Main {
    public static void main(String[]args){
        Scanner scan= new Scanner(System.in);
        int h = scan.nextInt();
        int w = scan.nextInt();
        
        boolean H[] = new boolean[h];
        boolean W[] =new boolean[w];
        char arr[][] = new char[h][w] ;
        scan.nextLine();
        for(int  i = 0 ; i < h ; i++){
            
            String T = scan.nextLine();
            
            for(int j = 0 ; j <w ;j++){
                arr[i][j] = T.charAt(j);
                
                if(arr[i][j] == '#'){
                    H[i] = true ;
                    W[j] = true ;
                }
            }          
        }
        
        for(int i = 0 ; i<h ; i++){
            boolean k = false; 
            for(int j = 0 ; j <w ; j++){
                if(H[i] && W[j]){
                     k = true ;
                    System.out.println(arr[i][j]);
                }
            }
            if(k){
                System.out.println("");
            }
        }
    }
}
