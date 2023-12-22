import java.util.Scanner;

public class Main {
	static int N;
	static int M;
	static int[] Pcity;
	static int[] Ycity;
	static int[][] PYcity;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		Pcity = new int[M];
		Ycity = new int[M];
		PYcity =  new int[M][2];
		for(int i=0;i<M;i++){
			Pcity[i] = sc.nextInt();
			Ycity[i] = sc.nextInt();
			PYcity[i][0] = Pcity[i];
			PYcity[i][1] = Ycity[i];
		}
		
		//先按行排序，再按列排序
		twoDimensionSort(PYcity);
		
		int Ynum = 0;
		for (int i=0;i<M;i++) {
			for(int r=0;r<M;r++){
				if(Pcity[i]==PYcity[r][0]){
					Ynum++;
					if(Ycity[i] == PYcity[r][1]){
						break;
					}
				}
			}
			System.out.println(mendPosition(Pcity[i])+mendPosition(Ynum));
			Ynum = 0;
        }
		
		sc.close();
	}
    
    private static String mendPosition(int num){
    	String numTemp = String.valueOf(num);
    	String strnum = "";
    	for(int i=0;i<6-numTemp.length();i++){
    		strnum += "0";
    	}
    	strnum = strnum+numTemp;
    	return strnum;
    } 
    
    public static void twoDimensionSort(int[][] PYcity) {
    	//行排序
		for(int i=0;i<PYcity.length-1;i++){
			for(int j=0;j<PYcity.length-1-i;j++){
				if(PYcity[j][0]>PYcity[j+1][0])
					swap(PYcity[j],PYcity[j+1]);
			}
		}
		//f为当前要排序的列
		for(int f=1;f<PYcity[0].length;f++){
			for(int i=0;i<PYcity.length;) {
				int count=0;
				int num=PYcity[i][f-1];
				if(f==1) {
					for(int j=0;j<PYcity.length;j++)
						if(PYcity[j][0]==num)
							count++;
				}
				else {
					for(int j=0;j<PYcity.length;j++) {
						boolean isSame=true;
						for(int p=1;p<=f;p++)
							if(PYcity[j][f-p]!=PYcity[i][f-p]) {
								isSame=false;
								break;
							}
						if(PYcity[j][f-1]==num&&isSame)
							count++;
					}
				}	
				for(int k=0;k<count-1;k++){
					for(int q=0;q<count-1-k;q++){
						if(PYcity[i+q][f]>PYcity[i+q+1][f])
							swap(PYcity[i+q],PYcity[i+q+1]);
					}
				}
				//i为下一个不同的数的行下标
				i+=count;
			}				
		}
	}
    
	public static void swap(int[] a,int[] b) {
		//交换一行
		int temp;
		for(int j=0;j<a.length;j++) {
			temp=a[j];
			a[j]=b[j];
			b[j]=temp;
		}			
	}
}


	

