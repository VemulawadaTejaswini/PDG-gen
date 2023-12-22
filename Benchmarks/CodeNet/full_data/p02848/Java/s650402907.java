import java.util.Scanner;


class Main {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int b = in.nextInt();
        String a=in.next();
        
        char[] ch = new char[a.length()];
        if(b==0){
            System.out.println(a);
        }
        else{
           
            for (int i = 0; i < a.length(); i++) { 
                
                ch[i] = (char) (a.charAt(i)+b);
                if(ch[i]>90){
                    int x=ch[i]-90;
                    ch[i]=(char) (x+65-1);
                }
            }
        }
       String z = new String(ch);
        System.out.println(z);
    }
    
    
}