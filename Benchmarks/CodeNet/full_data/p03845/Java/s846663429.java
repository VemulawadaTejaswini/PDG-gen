import java.util.*;
public class Main {
	//内部类
    class Drinks{
		int pro_num;
		int pro_time;
		//构造方法
		public Drinks(int num,int time) {
			this.pro_num=num;
			this.pro_time=time;
		}
		//获取喝饮料后的对应题数
		public int get_num(){
			return pro_num;
		}
		//获取喝饮料后做题的时间
		public int get_time() {
			return pro_time;
		}
		
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		Main out_Times=new Main();
		int N=sc.nextInt();
	    int N_time[]=new int[N];
	    for(int i=0;i<N;i++) {
	    	N_time[i]=sc.nextInt();
	    }
	    
	    int M=sc.nextInt();
	    int temp=0;
	    Drinks drinks[]=new Drinks[M];
	    for(int i=0;i<M;i++) {
	    	int num=sc.nextInt();
	    	int time=sc.nextInt();
	    	drinks[i]=out_Times.new Drinks((num-1),time);
	    }
	    for(int i=0;i<M;i++){
	    	int total_time=0;         //用于计算总时间
	    	//替换喝饮料时间
	    	int k=drinks[i].get_num();
	    	temp=N_time[k];
	    	N_time[k]=drinks[i].get_time();
	    	for(int j=0;j<N;j++) {
	    		total_time=total_time+N_time[j];

	    	}
	    	System.out.println(total_time);
	    	//保持原来的时间数据不变
	    	N_time[k]=temp;
	    }
	    
	}

}
