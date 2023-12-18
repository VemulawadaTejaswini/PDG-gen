public class Main{
     public static void main(String[] args){
            int mx=3;
            int table[]=new int[mx];
            Scanner sc = new Scanner(System.in);
            int i;
            for(i=0;i<mx;i++){
                table[i]=sc.nextInt();
            }
            for(i=1;i<mx;i++){
                if(table[i-1]>table[i]){
                    int c=table[i-1];
                    table[i-1]=table[i];
                    table[i]=c;
                }
            }
            for(i=1;i<mx;i++){
                if(table[i-1]>table[i]){
                    int c=table[i-1];
                    table[i-1]=table[i];
                    table[i]=c;
                }
            }
            for(i=0;i<mx;i++){
                System.out.printf("%d",table[i]);
                if(i+1!=mx){
                    System.out.printf(" ");
                }
            }
            System.out.printf("\n");
        }
    }
