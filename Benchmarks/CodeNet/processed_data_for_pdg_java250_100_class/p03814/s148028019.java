public class Main {    
    public static void main(String[] args){        
        Scanner sc = new Scanner(System.in);                                
        String s = sc.next();
        int start = 0;
        int   end = s.length() - 1;
        boolean flag = true;        
        for(int i = 0;i < s.length();i++){
            if(s.charAt(i) == 'A' && flag){
                 start = i;
                 flag  = false;
            }
            if(s.charAt(i) == 'Z'){
                 end  = i;
            }
        }
        System.out.println(end - start + 1);
    }            
}
