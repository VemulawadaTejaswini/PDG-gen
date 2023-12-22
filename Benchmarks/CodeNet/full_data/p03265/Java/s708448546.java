import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int x1 = sc.nextInt();
	int y1 = sc.nextInt();
	int x2 = sc.nextInt();
	int y2 = sc.nextInt();
	int len = 0;
	int x3=0,y3=0,x4=0,y4=0;
	if(y1==y2){
	    len = Math.abs(x1-x2);
	    if(x1>x2){
		x3 = x2;
		y3 = y2-len;
		x4 = x1;
		y4 = y1-len;
	    }else{
		x3 = x2;
		y3 = y2+len;
		x4 = x1;
		y4 = y1+len;
	    }
	}else{
	    len = Math.abs(y1-y2);
	    if(y1 > y2){
		x3 = x2+len;
		y3 = y2;
		x4 = x1+len;
		y4 = y1;
	    }else{
		x3 = x2-len;
		y3 = y2;
		x4 = x1-len;
		y4 = y1;
	    }
	}
	System.out.print(x3+" "+y3+" "+x4+" "+y4);
    }
}
