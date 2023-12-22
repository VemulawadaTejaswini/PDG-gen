import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int length=100000;
        char[][] ans=new char[length][n];
        int count=0;
        int oldcount=1;
        ans[0][0]='a';
        for(int i=1;i<n;i++){
            for(int j=0;j<oldcount;j++){
                ans[j][i]='a';
                for(int k=98;k<ans[j][i-1]+2;k++){
                    count++;
                    for(int l=0;l<i;l++){
                        ans[count][l]=ans[j][l];
                    }
                    ans[count][i]=(char)k;
                }
            }
            oldcount=count+1;
        }
        String[] finalans=new String[length];
        for(int i=0;i<length;i++){
            finalans[i]="";
            for(int j=0;j<n;j++){
                finalans[i]+=ans[i][j];
            }
        }
        Arrays.sort(finalans);
        String bad=finalans[0];
        for(int i=0;i<length;i++){
            if(!finalans[i].equals(bad)){
                
                System.out.println(finalans[i]);
            }
        }
        
        
 
    }



}


