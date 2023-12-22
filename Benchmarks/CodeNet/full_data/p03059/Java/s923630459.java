import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Main atc = new Main();
        
        System.out.println(atc.questionA());
    }
    
    public int questionA(){
        Scanner scan =new Scanner(System.in);
        String input = scan.nextLine();
        
        String[] point = input.split(" ");
        int kankaku = Integer.parseInt(point[0]);
        int maisu = Integer.parseInt(point[1]);
        int time = Integer.parseInt(point[2]);
        return (time / kankaku) * maisu;
    }
    
}
