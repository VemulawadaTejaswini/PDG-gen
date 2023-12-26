public class Main{
	public static void main(String[] args){
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		try{
			String t=reader.readLine();
			String s=reader.readLine();
			int n=Integer.parseInt(t);
			String[] str =s.split(" ");
			int array_num[]= new int[n];
			long max, min, sum;
			sum=0;
			max=-1000000;
			min=1000000;
			for(int i=0;i<n;i++){
				array_num[i]=Integer.parseInt(str[i]);
				sum+=array_num[i];
				if(array_num[i]>max)max=array_num[i];
				if(array_num[i]<min)min=array_num[i];
			}
			System.out.println(min+" "+max+" "+sum);
			reader.close();
		}catch(IOException e){
			System.out.println("??¨??????:"+e);
		}
	}
}
