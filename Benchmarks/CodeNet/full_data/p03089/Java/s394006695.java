import java.util.*;
public class Main {
	public static void main(String[] args){
      	boolean ans=true;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int [] B=new int[n+1];
        int i,j,k,l;
      	List<Integer>now =new ArrayList<>();
      	int [][]pos=new int[n+1][n+1];
        int [][]cnt=new int[n+1][n+1];
        int [] res=new int[n+1];
		for (i=1;i<=n;i++){
        	B[i] = sc.nextInt();
          	if (i<B[i])ans=false;
            pos[i][0]++;
            pos[i][pos[i][0]]=i;
        }
       if (!ans) {
			System.out.println(-1);
			return;
		}
       for (i=n-1;i>0;i--) {
			for (j=B[i]-1;j>0;j--) {
				cnt[i][j]=cnt[i+1][j];
			}
			if (B[i+1]<B[i])cnt[i][B[i+1]]++;
		}
        for (i=1;i<=n;i++){
          for (j=i;j>=1;j--){
          	if (pos[j][pos[j][0]]==0)continue;
        	boolean can=true;
        	if (j==1) {
        		  res[i]=j;
                  now.add(0,j); 
                  break;
        	 }
        	 k=pos[j][pos[j][0]];
            int []tmp=new int[j];
            	for (l=j-1;l<now.size();l++)
                   if(now.get(l)<j)tmp[now.get(l)]++;
              	for (l=j-1;l>=1;l--)
                  if (tmp[l]<cnt[k][l]){
                    can=false;
                    break;
                  }
              	if (can){
                  res[i]=j;
                  now.add(j-1,j);
                  break;
                }
            }
            
          
        }
		for(i=1;i<=n;i++)
			System.out.println(res[i]);
		return;
	}
}
