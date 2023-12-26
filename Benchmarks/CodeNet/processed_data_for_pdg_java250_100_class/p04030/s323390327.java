class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);    
        String str = sc.next();     
        String ans = "";            
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='0'){         
                ans += "0";                 
            }
            else if(str.charAt(i)=='1'){    
                ans += "1";                 
            }
            else if(ans.length()==1){       
                ans = "";
            }
            else if(ans.length() > 1){      
                ans = ans.substring(0,ans.length()-1);  
            }
        }
        System.out.println(ans);    
    }
}
