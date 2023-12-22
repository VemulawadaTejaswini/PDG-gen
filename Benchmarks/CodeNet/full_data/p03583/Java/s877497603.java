import java.lang.*;
import java.util.*;
import java.io.*;

class FourN{
    public long[]solve(int N){
	long[]retArr = new long[3];
	long hMinVal = Math.max(N/4,1);
	long hMaxVal = 1<<62;
	double C = 4.0/N;
	boolean found = false;
	for(long h=hMinVal;h<=hMaxVal;h++){
	    long nMinVal = (long)(1.0/(C-1.0/h))-2;
	    nMinVal = Math.max(nMinVal,1);
	    long nMaxVal = (long)(1.0/(C-(1.0/h)-(4.0/N)));
	    if(nMaxVal<0)nMaxVal = hMaxVal;
	    nMaxVal = Math.max(nMaxVal,1);
	    //	    System.out.format("solve, h %d, nmin %d, nmax %d\n",h,nMinVal,nMaxVal);
	    for(long n=nMinVal;n<=nMaxVal;n++){
		long div = (-N*n-h*N+4*n*h);
		if(div>0){
		    long w = (h*n*N)/div;
		    //	    System.out.format("h %d n %d w %d\n",h,n,w);
		    if((4*h*n*w)==(N*n*w+N*h*w+N*n*h)){
			retArr[0] = h;
			retArr[1] = n;
			retArr[2] = w;
			found = true;
			break;
		    }
		}
	    }
	    if(found)break;	    
	}
	return retArr;
    }
    
    public static void main(String[] args){
       try{
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	  String nLn = br.readLine();
	  int N = Integer.parseInt(nLn);
	  FourN fn = new FourN();
	  long[]hnw = fn.solve(N);
	  String hStr = Long.toString(hnw[0]);
	  String nStr = Long.toString(hnw[1]);
	  String wStr = Long.toString(hnw[2]);	  
	  bw.write(hStr);
	  bw.write(" ");
	  bw.write(nStr);
	  bw.write(" ");
	  bw.write(wStr);
	  bw.newLine();
	  bw.flush();
       }catch(Exception e){
          e.printStackTrace();
       }
    }
}	  
