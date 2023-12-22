
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main {

    
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        int N=Integer.parseInt(br.readLine());
        String[] arr=new String[N];
        int[][] occurence=new int[N][2];//Maps first occurence of anagram to its occurence #.
        
        for (int i = 0; i < N; i++) {
            
            arr[i]=br.readLine();
            boolean flag=false;
            for(int j=0;j<i;j++){
                if(isAnagram(arr[i],arr[j]) && !flag){
                   occurence[j][1]++;
                   flag=true;
                }
            }
        }
        int sum=0;
        for(int i=0;i<N;i++){
            sum+=(occurence[i][1])*(occurence[i][1]+1);
        }
        
        System.out.println(sum/2);
    }
    public static boolean isAnagram(String a, String b){
        
        if(a.equals(b))return true;
        
        else{
            boolean flag=false;
            
            for (int i = 0; i < b.length(); i++) {
                if(a.charAt(0)==b.charAt(i)){
                    flag=true;
                    
                
                    return isAnagram(a.substring(1),b.substring(0,i)+b.substring(i+1));
                }
            
            
            }
            if(!flag)return false;
        
        }
        return false;
    }
}
