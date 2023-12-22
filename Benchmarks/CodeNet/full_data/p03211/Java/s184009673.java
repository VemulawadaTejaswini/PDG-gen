import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        String S =sc.next();
        String A ;
        int ans=0;
        int answer=0;
        int result=1000000000;
        int num[]=new int[3];
        
        String [] List = S.split("");
        
        for(int i=0;i<List.length-2;i++){
            
            A=List[i]+List[i+1]+List[i+2];
            ans=Integer.parseInt(A);
            answer=Math.abs(753-ans);
            if(answer<result){
                result=answer;
            }
            
            
        }
        
        System.out.println(result);
        
        
        
        
        
        
    }
}
