import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner stdIn=new Scanner(System.in);
        int N=stdIn.nextInt();

        int []a=new int[N-1];

        for(int i=0; i<a.length; i++){
            a[i]=stdIn.nextInt();
        }
        int []b=new int[N];
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a.length; j++){
                if(a[j]==i+1){
                    b[i]++;
                }
            }
        }
        System.out.println();
        
        for(int i=0; i<N; i++){
            System.out.println(b[i]);
            
        }



        
    }

}