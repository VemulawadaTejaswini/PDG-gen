import java.util.*;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        int[] nums = new int[4];
        
        String text = scanner.next();
        
        for(int i=0; i<nums.length; i++){
            nums[i] = text.charAt(i)-'0';
           // System.out.print(nums[i]+" ");
        }
       
        
        int n = nums.length-1;
        Character[] str = new Character[n];
        
        int result = 0;
        for(int bit=0; bit < Math.pow(2,n); bit++){
            
        
            for(int i=0;i<n;i++){
                if((bit & (1<<i))!=0){
                    str[i] = '+';
                    
                }else{
                    str[i] = '-';
                    
                }
                
            }
            int[] str_nums = nums.clone();
            result = caluclator(str,str_nums);
            
            
            if(result==7){
                for(int i=0;i<3;i++){
                    System.out.print(nums[i]);
                    System.out.print(str[i]);
                }
                
                System.out.print(nums[3]+"=7");
                break;
            }
            
            
            
            
        }
    }
    
    static int caluclator(Character operator[],int nums2[]){
        
        for(int i=0;i<3;i++){
            
            if(operator[i]=='+'){
                
                nums2[i+1] = nums2[i]+nums2[i+1];
            }else{
               
                 nums2[i+1] = nums2[i]-nums2[i+1]; 
            }
        }
        return nums2[3];
        
    }
        
        
}