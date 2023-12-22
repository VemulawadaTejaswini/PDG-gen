import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		Point[] arr;
	    arr=new Point[M]; 
		for(int i=0;i<M;i++){
			arr[i]=new Point();
			arr[i].x=sc.nextInt();
			arr[i].y=sc.nextInt();
		}
		Point[] tmp=arr.clone();
		Arrays.sort(tmp, new MyComprator());
		for(int i=0;i<M;i++){  		

			int k=0;
			for(int j=0;j<M;j++) {
			
				if(arr[i].x==tmp[j].x){
					k++;
					if(arr[i].y==tmp[j].y){
						arr[i].y=k;
					}
				}
			}	
			String str =String.format("%06d%06d", arr[i].x,arr[i].y); 
			System.out.println(str);
		}
		sc.close();
	}
}

class Point{
    int x;
    int y;
}

class MyComprator implements Comparator {
    public int compare(Object arg0, Object arg1) {
    	Point t1=(Point)arg0;
        Point t2=(Point)arg1;
        if(t1.x != t2.x)
            return t1.x>t2.x? 1:-1;
        else
            return t1.y>t2.y? 1:-1;
    }
}