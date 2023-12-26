public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	    int buildcnt = sc.nextInt();
        int hights[]= new int[buildcnt];
            boolean reach =false;
      String answer = "Yes";
        for(int i=0 ; i<buildcnt ; i++){
         hights[i]=sc.nextInt(); 
        }
      for(int i=buildcnt-1 ; i>0 ; i--){
          if(hights[i-1] - hights[i] >1 ){
            answer = "No";
            break;
          }else if(hights[i-1]-hights[i]==1 && !reach){
            reach=true;
          }else if(hights[i-1]-hights[i]==1 && reach){
            answer="No";
            break;
          }else if(hights[i-1]-hights[i]==0 && reach){
            reach=true;
          }else{
            reach=false;
          }
      }
		System.out.println(answer);
	}
}
