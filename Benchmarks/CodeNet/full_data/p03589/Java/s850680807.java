import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		long N = Long.parseLong(in.next());
		boolean breakFlag = false;
long h,n,w;
		h=1;
		n=1;
		w=1;
//		for (h = 1; h <= 3500; h++){
			for (n = 1; n <= 3500; n++){
				for (w = 1; w <= 3500; w++){
					if(4*n*w>N*(n+w))h=N*n*w/(4*n*w-N*(n+w));
					if(4*h*n*w==N*(h*n+n*w+w*h)){
						breakFlag = true;
					}
					if(breakFlag)break;
				}if(breakFlag)break;
			}/*if(breakFlag)break;
		}*/
		System.out.println(h+" "+n+" "+w);
	}
}