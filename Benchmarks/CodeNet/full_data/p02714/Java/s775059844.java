import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        String S=sc.next();
        int[] data=new int[N];
        int[] cotR=new int[N+1];
        int[] cotG=new int[N+1];
        int[] cotB=new int[N+1];
        
        long ans=0L;
        
        for(int i=0;i<N;i++){
            if(S.charAt(i)=='R'){
                data[i]=0;
            }else if(S.charAt(i)=='G'){
                data[i]=1;
            }else{
                data[i]=2;
            }
            cotR[i]=cotG[i]=cotB[i]=0;
        }
        cotB[N]=cotG[N]=cotR[N]=0;
        
        for(int i=N-1;i>-1;i--){
            if(data[i]==0){
                cotR[i]=cotR[i+1]+1;
                cotG[i]=cotG[i+1];
                cotB[i]=cotB[i+1];
            }else if(data[i]==1){
                cotR[i]=cotR[i+1];
                cotG[i]=cotG[i+1]+1;
                cotB[i]=cotB[i+1];
            }else{
                cotR[i]=cotR[i+1];
                cotG[i]=cotG[i+1];
                cotB[i]=cotB[i+1]+1;
            }
        }

        
        for(int i=0;i<N;i++){//Rを取り出すindex
            if(data[i]!=0){
                 continue;   
            }
            for(int j=i+1;j<N;j++){//Gを取り出すindex
                if(data[j]!=1){
                    continue;
                }else{
                    ans+=cotB[j+1];
                    if(2*j-i<N&&data[2*j-i]==2){
                        ans--;
                    }
                }
            }
        }
        
        for(int i=0;i<N;i++){//Gを取り出すindex
            if(data[i]!=1){
                 continue;   
            }
            for(int j=i+1;j<N;j++){//Rを取り出すindex
                if(data[j]!=0){
                    continue;
                }else{
                    ans+=cotB[j+1];
                    if(2*j-i<N&&data[2*j-i]==2){
                        ans--;
                    }
                }
            }
        }
        
        for(int i=0;i<N;i++){//Gを取り出すindex
            if(data[i]!=1){
                 continue;   
            }
            for(int j=i+1;j<N;j++){//Rを取り出すindex
                if(data[j]!=2){
                    continue;
                }else{
                    ans+=cotR[j+1];
                    if(2*j-i<N&&data[2*j-i]==0){
                        ans--;
                    }
                }
            }
        }
        
        for(int i=0;i<N;i++){//Gを取り出すindex
            if(data[i]!=2){
                 continue;   
            }
            for(int j=i+1;j<N;j++){//Rを取り出すindex
                if(data[j]!=1){
                    continue;
                }else{
                    ans+=cotR[j];
                    if(2*j-i<N&&data[2*j-i]==0){
                        ans--;
                    }
                }
            }
        }
        
        for(int i=0;i<N;i++){//Gを取り出すindex
            if(data[i]!=2){
                 continue;   
            }
            for(int j=i+1;j<N;j++){//Rを取り出すindex
                if(data[j]!=0){
                    continue;
                }else{
                    ans+=cotG[j];
                    if(2*j-i<N&&data[2*j-i]==1){
                        ans--;
                    }
                }
            }
        }
        
        for(int i=0;i<N;i++){//Gを取り出すindex
            if(data[i]!=0){
                 continue;   
            }
            for(int j=i+1;j<N;j++){//Rを取り出すindex
                if(data[j]!=2){
                    continue;
                }else{
                    ans+=cotG[j];
                    if(2*j-i<N&&data[2*j-i]==1){
                        ans--;
                    }
                }
            }
        }
        
        System.out.println(ans);
        
        
    }
}
