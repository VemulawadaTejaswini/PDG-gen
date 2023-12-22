import java.util.Scanner;
public class Main{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        String S = scan.nextLine();

        for(int i=1;i<S.length();i++){

            if(1 == ((i+1)%2)){
            
                if("R".equals(S.substring((i-1),i))){
                    System.out.print("No");
                    System.exit(0);

                }



            }else{
                if("L".equals(S.substring((i-1),i))){
                    System.out.print("No");
                    System.exit(0);

                }
            }
        }
        System.out.print("Yes");

        




        }
    }
