public class Main{
    public static void main(String[] args){
        int i=1; 
        Scanner sc = new Scanner(System.in);        
        while(true){            
            int a = sc.nextInt();
            if(a == 0) break;
            System.out.println("Case "+i+": "+a);          
            i++;
        } 
        sc.close();
    }
}
