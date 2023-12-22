import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int ans = 0;
        
        String[] sArray = new String[s.length()];
        for(int i = 0; i < s.length(); i++){
            String s2 = String.valueOf(s.charAt(i));
            sArray[i] = s2;
        }
        for(int i = 0; i < n-2; i++){
            if(sArray[i].equals("A")){
                if(sArray[i+1].equals("B")){
                    if(sArray[i+2].equals("C")){
                        ans++;
                    }else{
                        
                    }
                }else{
                    
                }
            }else{
                
            }
            
        }
        System.out.print(ans);
    }
           
}