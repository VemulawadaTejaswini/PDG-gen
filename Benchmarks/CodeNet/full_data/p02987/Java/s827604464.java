import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        String str=entrada.next();
        String str2="";
        int p=-2;
        int cont=0;
        for(int i=0; i<str.length();i++){
            char c=str.charAt(i);
            for(int j=0;j<str.length();j++){
                if(str.charAt(j)==(c)){
                    cont+=1;
                }
            }
        }
        if (cont==8){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        //System.out.println(cont);
    }
}
    
