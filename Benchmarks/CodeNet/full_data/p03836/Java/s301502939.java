import java.util.*;
public class c{
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        StringBuilder sb = new StringBuilder();
	        int sx =  Integer.parseInt(sc.next());
	        int sy =  Integer.parseInt(sc.next());      
	        int tx =  Integer.parseInt(sc.next());               
	        int ty =  Integer.parseInt(sc.next());        
	        int dx = tx - sx;
	        int dy = ty - sy;
	        for(int i = 0; i < dx; i++){
	            sb.append('R');            
	        } 
	        for(int i = 0; i < dy; i++ ){ 
	            sb.append('U');
	        }
	        for(int i = 0; i < dx; i++ ){
	            sb.append('L');
	        } 
	        for(int i = 0; i < dy; i++){
	            sb.append('D');
	        }
	        sb.append('D');
	        for(int i = 0; i < dx+1; i++){
	            sb.append('R');            
	        }       
	        for(int i = 0; i < dy+1; i++ ){ 
	            sb.append('U');
	        }
	        sb.append('L');
	        sb.append('U');
	        for(int i = 0; i < dx+1; i++ ){
	            sb.append('L');
	        }        
	        for(int i = 0; i < dy+1; i++){
	            sb.append('D');
	        } 
	        sb.append('R'); 
	        System.out.println(new String(sb));
	    }
 }