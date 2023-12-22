import java.util.*;
import java.io.*;
import java.lang.*;

public class Main{
public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner s = new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
       int n=s.nextInt(),m=s.nextInt(),l=s.nextInt();
       long[][] g1=new long[n+1][n+1];
       for(int i=1;i<=n;i++){
       	Arrays.fill(g1[i],(long)1e13);
       }
       for(int i=0;i<m;i++){
       	int x=s.nextInt(),y=s.nextInt(),c=s.nextInt();
       	g1[x][y]=c;  
       	g1[y][x]=c;  
       }

       for(int i=0;i<n;i++){
       	g1[i][i]=0;
       }

       	for (int k = 1; k <= n; k++) 
        { 
            for (int i = 1; i <= n; i++) 
            { 
                for (int j = 1; j <= n; j++) 
                { 
                    g1[i][j]=Math.min(g1[i][j],g1[i][k] + g1[k][j]); 
                } 
            } 
        } 
        long[][] g2=g1.clone();
        for(int i=1;i<=n;i++){
        	for(int j=1;j<=n;j++){
        		g2[i][j]=g1[i][j]<=l? 1:(long)1e13;
        	}
        }

        for (int k = 1; k <= n; k++) 
        { 
            for (int i = 1; i <= n; i++) 
            { 
                for (int j = 1; j <= n; j++) 
                { 
                    g2[i][j]=Math.min(g2[i][j],g2[i][k] + g2[k][j]); 
                } 
            } 
        } 

        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        List<Integer>l1=new ArrayList<>();
        int q=s.nextInt();
        for(int i=0;i<q;i++){
        	int start=s.nextInt(),end=s.nextInt();
        	if(g2[start][end]==(long)1e13){
        		l1.add(-1);
        	}
        	else{
        		l1.add((int)g2[start][end]-1);        	
        	}
        }
        for(int i=0;i<l1.size();i++){
        	out.write(l1.get(i)+ " ");
        	out.write("\n");
            out.flush();
        }
    }
}
    
  










