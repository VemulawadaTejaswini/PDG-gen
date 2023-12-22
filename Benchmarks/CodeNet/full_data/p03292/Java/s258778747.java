package atcorder;

public class HelloWorld{
	  public static void main(String args[]){
		  int[] arg = new int[3];
	     int y;
	     for(int x=0 ; x < 3 ; x++){
		arg[x] = Integer.parseInt(args[x]);
	     }
	     if(arg[0] < arg[1]){
		y = arg[0];
		arg[0] = arg[1];
		arg[1] = y;
		System.out.println("テスト1");
	     }
	     if(arg[1] < arg[2]){
		y = arg[1];
		arg[1] = arg[2];
		arg[2] = y;
	     }
	     if(arg[0] < arg[1]){
		y = arg[0];
		arg[0] = arg[1];
		arg[1] = y;
	     }
	     for(int x=0; x<3;x++){
		System.out.println(arg[x]);
	     }
	     System.out.println((arg[0] - arg[1]) + (arg[1] - arg[2]));
	   }
	}