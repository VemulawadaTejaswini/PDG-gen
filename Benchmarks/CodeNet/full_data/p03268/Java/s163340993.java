public class findTriplet{

    public static void main(String []args){
    Scanner input =new Scanner(System.in);
    int N = input.nextInt();
   
    int K = input.nextInt();
    int count=0;
    for(int i=1;i<=N;i++){
    for(int j=1;j<=N;j++){
      for(int l=1;l<=N;l++){
             if((i+j) % K == 0 && (i+l) % K == 0 && (j+l) % K == 0){
                int [] a={i,j,l}; 
                count ++;
             }
      }
     }
}
System.out.println(count);
}
}