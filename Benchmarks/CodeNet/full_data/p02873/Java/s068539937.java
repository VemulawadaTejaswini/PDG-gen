import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String ss = sc.next();
		int[] res = new int[ss.length()];
		long sum = 0;
		int count = 0;
		boolean flg = true;
		
		int st_num=0;
		
		for(int i=0;i<ss.length();i++){
			if( ss.charAt(i) == '<' ){
				if (flg){
					count++;
				}else{
					if(count<st_num){
						sum+=count*(count-1)/2;
					}else{
						sum+=Math.max((1+count)*count/2- st_num,0);
					}
						
					System.out.println(sum);
					st_num=count;
					flg=false;
					count=1;
				}
				flg=true;
			}else{
				if(flg){
					if(st_num<count){
						sum+=(1+count)*count/2;
						st_num=count;
					}else{
						sum+=(1+count)*count/2;
						st_num=count;
					}
					count=1;
				}else{
					count++;
				}
				flg=false;
			}
		}
		
		if(flg){
			sum+=(1+count)*count/2;
		}else{
			sum+=Math.max((1+count)*count/2- st_num,0);
		}
		
		
		System.out.println(sum);
	}
}