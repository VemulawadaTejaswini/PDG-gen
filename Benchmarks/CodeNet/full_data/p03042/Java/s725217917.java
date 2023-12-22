import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int first = S / 100;
        int later = S % 100;

        System.out.println(first);
        System.out.println(later);

        if(first < 13 && 0 < first && 0 < later && later < 13){
            System.out.println("AMBIGUOUS");
        }else if(first < 13 && 0 < first && 12 < later){
            System.out.println("MMYY");
        }else if(12 < first && 0 < later && later <13){
            System.out.println("YYMM");
        }else{
            System.out.println("NA");
        }
    }
}
