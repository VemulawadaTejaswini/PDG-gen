import java.lang.*;
import java.util.*;
import java.io.*;

public class Main{
    static Integer[]strToIntArr(String s){
	//	s = s.substring(1,s.length()-1);
	String[] sArr = s.split(" ");
	int len = sArr.length;
	Integer[] retArr = new Integer[len];
	for(int i=0;i<len;i++){
	    retArr[i] = new Integer(Integer.parseInt(sArr[i]));
	}
	return retArr;
    }

    Hashtable<String,Boolean>setHT(int n, int[]xArr,int[]yArr){
	Hashtable<String,Boolean>coordHT = new Hashtable<String,Boolean>();
	for(int i=0;i<n;i++){
	    String cStr = Integer.toString(xArr[i])+"_"+Integer.toString(yArr[i]);
	    coordHT.put(cStr,true);
	}
	return coordHT;
    }

    int getNumPossible(Hashtable<String,Boolean>coordUsed, int x, int y, int p, int q){
	int ct = 2;
	boolean found = true;
	while(found){
	    x += p;
	    y += q;
	    String cStr = Integer.toString(x)+"_"+Integer.toString(y);
	    if(!coordUsed.containsKey(cStr)){
		found = false;
	    }else{
		ct++;
	    }
	}
	return ct;
    }

    public int getMinCost(int n, int[]xArr,int[]yArr){
	//	int maxCt = -1;
	Hashtable<String,Boolean>coordUsed = setHT(n,xArr,yArr);
	Hashtable<String,Integer>ctTab = new Hashtable<String,Integer>();
	Hashtable<String,Integer>costTab = new Hashtable<String,Integer>();	
	for(int i=0;i<n;i++){
	    int startX = xArr[i];
	    int startY = yArr[i];
	    for(int j=0;j<n;j++){
		if(i!=j){
		    int nextX = xArr[j];
		    int nextY = yArr[j];
		    int p = nextX-startX;
		    int q = nextY-startY;
		    String pqStr = Integer.toString(p)+"_"+Integer.toString(q);
		    int ct = getNumPossible(coordUsed,nextX,nextY,p,q);
		    if(ctTab.containsKey(pqStr)){
			int currCt = ctTab.get(pqStr);
			int currCost = costTab.get(pqStr);
			ctTab.put(pqStr,currCt+ct);
			costTab.put(pqStr,currCost+1);
		    }else{
			ctTab.put(pqStr,ct);
			costTab.put(pqStr,1);
		    }
			//	    if(ct>maxCt){
			//maxCt = ct;
			//}
		}
	    }
	}
	//	int retV = n-maxCt+1;
	Enumeration<String>keys = ctTab.keys();
	int minCost = n;
	while(keys.hasMoreElements()){
	    String k = keys.nextElement();
	    int ct = ctTab.get(k);
	    int cost = costTab.get(k);
	    int totCost = cost+(n-ct);
	    if(totCost<minCost){
		minCost = totCost;
	    }
	}
	int retV = minCost;
	if(n==1)retV = 1;
	return retV;
    }
    
    public static void main(String[]args) throws Exception{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	Main m = new Main();
	String nLn = br.readLine();
	int n = Integer.parseInt(nLn);
	int[]xArr = new int[n];
	int[]yArr = new int[n];
	for(int i=0;i<n;i++){
	    String xyLn = br.readLine();
	    Integer[]xyArr = strToIntArr(xyLn);
	    xArr[i] = xyArr[0];
	    yArr[i] = xyArr[1];
	}
	int minC = m.getMinCost(n,xArr,yArr);
	bw.write(Integer.toString(minC));
	bw.newLine();
	bw.flush();
    }    
}
