import java.io.*;
class Main {
 public static void main(String[] args) throws IOException{
	try ( BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ){
      	String[] arr = br.readLine().split(" ");
      	int x1 = Integer.parseInt(arr[0]);
      	int y1 = Integer.parseInt(arr[1]);
      	int x2 = Integer.parseInt(arr[2]);
      	int y2 = Integer.parseInt(arr[3]);
      	int len_x,len_y = 0;
      	String result = null;
		if( x1 <= x2 ){
          if( y1 <= y2 ){//case1
			len_x = x2 - x1;
			len_y = y2 - y1;
            result = String.format("%d %d %d %d", x2-len_y, y2+len_x, x1-len_y, y1+len_x);
          } else {//case2
			len_x = x2 - x1;
			len_y = y1 - y2;
            result = String.format("%d %d %d %d", x2+len_y, y2+len_x, x1+len_y, y1+len_x);
          }
        } else if( y1 <= y2 ){//case3
			len_x = x1 - x2;
			len_y = y2 - y1;
            result = String.format("%d %d %d %d", x2-len_y, y2-len_x, x1-len_y, y1-len_x);
        } else {//case4
			len_x = x1 - x2;
			len_y = y1 - y2;
            result = String.format("%d %d %d %d", x2+len_y, y2-len_x, x1+len_y, y1-len_x);
        }          
		System.out.println(result);
	}
 }
}