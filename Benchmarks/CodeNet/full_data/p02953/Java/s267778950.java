import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	    int buildcnt = sc.nextInt();
        int hights[]= new int[buildcnt];
            boolean reach =false;
      String answer = "YES";
        for(int i=0 ; i<buildcnt ; i++){
         hights[i]=sc.nextInt(); 
        }
//      List<Integer> numlist = new ArrayList<Integer>();
//      while(sc.hasnext()){
  //      numlist.add(sc.nextInt());
    //  }
      for(int i=0 ; i < buildcnt ; i++){
        for(int j=0; j < buildcnt-i ; j++){
          if(hights[i] - hights[i+j]>j){
          answer = "NO";
          }
        }
      }

//      int now = sc.nextInt();
//      while(sc.hasNext()){
//       int next = sc.nextInt();
       //今-次が2以上ならNG
 //      if(now - next >= 2){
//         answer="NO";
  //       break;
  //     }else if(now - next == 1){
        
  //       if(reach == true){
  //        answer ="NO";
  //         break;
  //       }else{
  //         reach=true;
  //         now = next;
  //       }
  //     }else{
  //      now = next;
  //      reach=false;
  //     }
   //   }
        // 出力 
		System.out.println(answer);
	}
}