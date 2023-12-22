import java.util.Scanner;
class Main{

    public static void main(String args[]){
        Main main = new Main();
        main.start();
    }

    public void start(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        String str = sc.next();
        String letters[] = str.split("");
        for(int i = 0; i < q; i++){
            int first = sc.nextInt();
            int last = sc.nextInt();
            int num = countAC(letters,first-1,last-1);
            
            System.out.println(num);
        }
        
    }

    public int countAC(String[] letters,int fIndex,int lIndex){
        int count = 0;
        boolean lastWasA = false;
        for(int i = fIndex; i <=lIndex; i++){
            if(letters[i].equals("A")){
                lastWasA = true;
            }else if(letters[i].equals("C")){
                if(lastWasA){
                    count++;
                }
                lastWasA = false;
            }else{
                lastWasA = false;
            }
        }
        return count;
    }
}