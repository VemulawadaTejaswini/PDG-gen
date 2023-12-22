import java.util.*;
    
public class Main {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
     
 	int sx = Integer.parseInt(sc.next());
    int sy = Integer.parseInt(sc.next());
    int tx = Integer.parseInt(sc.next());
    int ty = Integer.parseInt(sc.next());
	
	System.out.print("D");
	for(int i = 0; i<=tx-sx; i++){
	    System.out.print("R");
	}
	for(int i = 0; i<=ty-sy; i++){
	    System.out.print("U");
	}
	System.out.print("L");
	System.out.print("U");
	for(int i = 0; i<=tx-sx; i++){
	    System.out.print("L");
	}
	for(int i = 0; i<=ty-sy; i++){
	    System.out.print("D");
	}
	System.out.print("R");
	for(int i = 0; i<tx-sx; i++){
	    System.out.print("R");
	}
	for(int i = 0; i<ty-sy; i++){
	    System.out.print("U");
	}
	for(int i = 0; i<tx-sx; i++){
	    System.out.print("L");
	}
	for(int i = 0; i<ty-sy; i++){
	    System.out.print("D");
	}

	sc.close();
    }
}