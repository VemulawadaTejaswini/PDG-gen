import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);

	try{ 
	    String buf = br.readLine();
	    String str[] = buf.split(" ", 0);

	    int flag = 0;
	    int H = Integer.parseInt(str[0]);
	    int W = Integer.parseInt(str[1]);
	    char S[][];
	    S = new char[H][W];

	    try{
		for(int i=0; i<H; i++){
		    String s = br.readLine();
		    for(int j=0; j<W; j++){
			S[i][j] = s.charAt(j);
		    }
		}
		for(int i=0; i<H; i++){
		    for(int j=0; j<W; j++){
			if(S[i][j] == '.'){
			    flag = CheckNeighbor(S, H, W, i, j);			    
			    if(flag == 1)
				break;
			}
		    }
		    if(flag == 1)
			break;
		}
		if(flag == 0){
		    System.out.println("Yes");
		}
	    }
	    catch(IOException e){
		System.out.println(e);
	    }
	}
	catch(IOException e){
	    System.out.println(e);
	}       
    }

    public static int CheckNeighbor(char S[][], int H, int W, int i, int j){
	int l=0,t=0,r=0,b=0;
	if(i != 0){	    
	    l = CheckLeft(S, i, j);
	}
	else{
	    l = 1;
	}
	if(j != 0){	    
	    t = CheckTop(S, i, j);
	}
	else {
	    t = 1;
	}
	if(i != H-1){
	    r = CheckRight(S, i, j);
	}
	else{
	    r = 1;
	}
	if(j != W-1){
	    b = CheckBtm(S, i, j);
	}
	else{
	    b = 1;
	}
	if(l+t+r+b == 4){
	    System.out.println("No");
	    return 1;
	}	
	return 0;
    }
    public static int CheckLeft(char S[][], int i, int j){
	if(S[i-1][j] == '.')
	    return 0;	
	else 
	    return 1;
    }
    public static int CheckTop(char S[][], int i, int j){
        if(S[i][j-1] == '.')
            return 0;
        else
            return 1;	
    }
    public static int CheckRight(char S[][], int i, int j){
        if(S[i+1][j] == '.')
            return 0;
        else
            return 1;
    }
    public static int CheckBtm(char S[][], int i, int j){
        if(S[i][j+1] == '.')
            return 0;
        else
            return 1;
    }

}