import java.util.Scanner;

/**
 *
 * @author cl18413
 */
class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner console =new Scanner(System.in);
        int a= console.nextInt();
        int b= console.nextInt();
        esCuadrado(a,b);
    }
    
    public static void esCuadrado(int a, int b){
        Double f=Math.sqrt(Integer.parseInt(""+a+b));
        if(f==f.intValue()){
            System.out.println("yes");            
        }else{
            System.out.println("no");
        }            
    }
    
}