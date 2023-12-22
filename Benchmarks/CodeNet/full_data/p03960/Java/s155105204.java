import java.util.*;
 
public class Main {
	public static void main(String[] args) {
 
		Scanner sc  = new Scanner(System.in);

		int o= 0 ,p = 0,q = 0;


		char ch;
		String str;
		

//      String s1 = sc.next();

        int H = Integer.parseInt(sc.next());
        int W = Integer.parseInt(sc.next());
        String[][] c = new String[H][W];
//      char[] c1 = s1.toCharArray();

        for(int i = 0; i < H ; i++){
            
            String s1 = sc.next();
            String[] arrays = s1.split("");
            
            for(int k = 0;  k < W ; k++){
                
                c[i][k] = arrays[k];
      //          System.out.print(c[i][k]);
                
            }
        //    System.out.println();
         }
         
         if(W==1){
             System.out.print(p);
         }
         if(W==2){
             
            String  fg = c[0][0];
            /*

             for(int ss = 0; ss < H ; ss++){
                 if( fg.equals( c[ss][0] ) ) p++;
                 if( fg.equals( c[ss][2] )) p++;
             }
             */
             if( fg.equals( c[0][1])  ) p++;
             System.out.print(p);
         }
         if(W==3){
             
             String  fg = c[0][1]; 

             for(int ss = 0; ss < H ; ss++){
                 if( fg.equals( c[ss][0] ) ) p++;
                 if( fg.equals( c[ss][2] )) p++;
             }
             
             
             System.out.print(p);
         }
         
         
         
/*

        while(true){
            test[o] = Integer.parseInt(sc.next());
            o++;
            if(o==s)break;
        }
*/

   //     System.out.print();
        System.out.println();
	}
}