import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int N=0,M=0;
		int[][] PY;
		String[] ID;
		Scanner sc = new Scanner(System.in);
        N=sc.nextInt();
        M=sc.nextInt();
        PY=new int[M][3];
        ID = new String[M+1];
        StringBuilder plpd,xlpd;
        int index=0;
        for(int i=0;i<M;i++){
        	index++;
        	PY[i][0]=index;
        	PY[i][1]=sc.nextInt();
        	PY[i][2]=sc.nextInt();
        }
        sort(PY,new int[]{1,2});
        int X=0;
        for(int i=0;i<M;i++){
        	if(i>0 && PY[i][1]!=PY[i-1][1]){
        		X=1;
        	}else{
        		X++;
        	}
        	plpd=new StringBuilder("");
          	xlpd=new StringBuilder("");
          	for(int k=0;k<6-Integer.toString(PY[i][1]).length();k++){
          		plpd.append("0");
          	}
          	for(int k=0;k<6-Integer.toString(X).length();k++){
          		xlpd.append("0");
          	}
        	ID[PY[i][0]] = plpd.toString()+PY[i][1]+xlpd.toString()+X;
        }
        for(int i=1;i<=M;i++){
        	   System.out.println(ID[i].toString());
           }
	}
	 public static void sort(int[][] ob, final int[] order) {    
         Arrays.sort(ob, new Comparator<Object>() {    
             public int compare(Object o1, Object o2) {    
                 int[] one = (int[]) o1;    
                 int[] two = (int[]) o2;    
                 for (int i = 0; i < order.length; i++) {    
                     int k = order[i];    
                     if (one[k] > two[k]) {    
                         return 1;    
                     } else if (one[k] < two[k]) {    
                         return -1;    
                     } else {    
                         continue;
                     }    
                 }    
                 return 0;    
             }    
         });   
     }    
}
