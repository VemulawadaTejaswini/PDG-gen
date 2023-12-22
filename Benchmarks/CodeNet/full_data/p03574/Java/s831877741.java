import java.util.*;

public class Main {
  
  public static void main (String[] args){
  
	Main main = new Main();
 	Scanner scanner = new Scanner (System.in);
    
  	int H = scanner.nextInt();
    int W = scanner.nextInt();
    
  	String[][] list = new String [H][W];
  
  	scanner.nextLine();
    
  	for (int i=0; i<H; i++){
  		String temp = scanner.nextLine();
    	for (int j=0; j<W; j++){
      		String[] templist = temp.split("");
      		list[i][j] = templist[j];
    	}
  	 }
    for (int i=0; i<H; i++){
      for (int j=0; j<W; j++){
    	  if (list[i][j].equals("#")) {
    	  } else {
    		  main.hantei(i,j,H,W,list);
    	  } 
        }
      }
    
    for(int i=0; i<H; i++) {
    	for (int j=0; j<W; j++) {
    		System.out.print(list[i][j]);
    	}
    	System.out.println();
    }
    }


  void hantei (int i, int j, int H, int W, String[][] list){
    boolean firstLine = false;
    boolean lastLine = false;
    boolean firstColumn = false;
    boolean lastColumn = false;
    int count=0;
    
    if (i==0){
      firstLine = true;
    }
    if (i==H-1){
      lastLine = true;
    }
    if (j==0){
      firstColumn = true;
    }
    if (j==W-1){
      lastColumn = true;
    }
    
    for (int k=0; k<8; k++) {
    	//左上、真上、右上、右横、右下、真下、左下、左横の順にチェックする
    	switch (k) {
    	case 0:
    		if (firstLine == true || firstColumn==true) {
    			break;
    		} 
    	    if (list[i-1][j-1].equals("#")) {
    	    	count++;
    	    }
    		break;
    	case 1:
    		if (firstLine == true) {
    			break;
    		}
    		if (list[i-1][j].equals("#")) {
    			count++;
    		}
    		break;
    	case 2:
    		if (firstLine==true || lastColumn==true) {
    			break;
    		}
    		if (list[i-1][j+1].equals("#")) {
    			count++;
    		}
    		break;
    	case 3:
    		if (lastColumn==true) {
    			break;
    		}
    		if(list[i][j+1].equals("#")) {
    			count++;
    		}
    		break;
    	case 4:
    		if (lastLine==true || lastColumn==true) {
    			break;
    		}
    		if (list[i+1][j+1].equals("#")) {
    			count++;
    		}
    		break;
    	case 5:
    		if (lastLine==true) {
    			break;
    		}
    		if (list[i+1][j].equals("#")) {
    			count++;
    		}
    		break;
    	case 6:
    		if (lastLine==true||firstColumn==true) {
    			break;
    		}
    		if(list[i+1][j-1].equals("#")) {
    			count++;
    		}
    		break;
    	case 7:
    		if(firstColumn==true) {
    			break;
    		}
    		if(list[i][j-1].equals("#")) {
    			count++;
    		}
    		break;
    	}
    	list[i][j]=String.valueOf(count);
    }
  }
}