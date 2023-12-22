import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		  
		  int N;
		  int M;
		  N = s.nextInt();
		  M = s.nextInt();
		  int code[][] = new int[M][4];
		  for(int i=0;i<M;i++) {
			  code[i][0]=i; //原始顺序
			  code[i][1]=s.nextInt();//城市
			  code[i][2]=s.nextInt();//创建时间
			  code[i][3]=0;//排序结果
		  }
		  int order[]= new int[M];
		  int value[]= new int[M];
		  int value_copy[]=new int[M];
		  
		  int l;
		  
		  for(int i=1;i<=N;i++) {
			  l=0;
			  for(int j=0;j<M;j++){
				  if(code[j][3]!=0) {
					  continue;
				  }
				  if(code[j][1]==i) {
					 order[l]=j;
					 value[l]=code[j][2];
					 l++;
				  }
			  }
			  if(l==0) {
				  continue;
			  }
			  value_copy=Arrays.copyOf(value,value.length);			
			  Arrays.sort(value_copy, 0, l);
			  //Arrays.sort(value_copy);
			  for(int x=0;x<M;x++) {
				  if(value[x]==0) {
					  break;
				  }
				  for(int y=0;y<M;y++) {
					  if(value_copy[y]==value[x]){
						  value[x]=y+1;
						  //value[x]=y+l+1-M;
						  break;
					  }
				  }
			  }
			  for(int k=0;k<l;k++) {
				  
				  code[order[k]][3]=value[k];//排序结果
			  }
			  
		  }
		  
		  double resurt;
		  double tt;
	
			NumberFormat nf = NumberFormat.getInstance();
			nf.setGroupingUsed(false);
			nf.setMaximumIntegerDigits(12);	
			nf.setMinimumIntegerDigits(12);
				
		  for(int p=0;p<M;p++) {
			 
			  tt=(int)code[p][1];
			  //System.out.println(tt);
			  resurt = tt*1000000 + (int)code[p][3];
			  //System.out.print(code[p][1]+"\t");
			  //System.out.println(code[p][3]);
			  System.out.println(nf.format(resurt));
		  }
		
			  s.close();
		  
	}
}
