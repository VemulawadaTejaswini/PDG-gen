import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        
        String s = sc.next();
        
        boolean[][][] exist = new boolean[10][10][10];
        
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                for(int k=0;k<10;k++){
                    exist[i][j][k]=false;
                }
            }
        }
        
        boolean[][] exist10 = new boolean[10][10];
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                exist10[i][j]=false;
            }
        }
        boolean[] exist_hundred = new boolean[10];
        for(int i=0;i<10;i++){
            exist_hundred[i]=false;
        }
        
        boolean all_c=true;
        int i_data=0, j_data=0,k_data=0;
        for(int i=0;i<n;i++){
            i_data=s.charAt(i)-48;
            
            if(!exist_hundred[i_data]){
                for(int j=i+1;j<n;j++){
                    j_data=s.charAt(j)-48;
                    
                    if(!exist10[i_data][j_data]){
                        for(int k=j+1;k<n;k++){
                            k_data=s.charAt(k)-48;
                            if(!exist[i_data][j_data][k_data]){
                                exist[i_data][j_data][k_data]=true;
                                
                                all_c=true;
                                for(int l=0;l<10;l++){
                                    if(!exist[i_data][j_data][k_data]) all_c=false;
                                }
                                if(all_c) exist10[i_data][j_data]=true;
                            }
                        }
                        
                        all_c=true;
                        for(int l=0;l<10;l++){
                            if(!exist10[i_data][j_data]) all_c=false;
                        }
                        if(all_c) exist_hundred[i_data]=true;
                    }
                }
            }
        }
        
        int count=0;
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                for(int k=0;k<10;k++){
                    if(exist[i][j][k]) count++;
                }
            }
        }
        System.out.println(count);
    }
}