import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
      	int Y = sc.nextInt();
      	int A = sc.nextInt();
      	int B = sc.nextInt();
     	int C = sc.nextInt();
        Integer[] Aa = new Integer[A];
      	for(int i = 0; i < A; i++){
        	Aa[i] = sc.nextInt();
        }
      	Integer[] Ba = new Integer[B];
      	for(int i = 0; i < B; i++){
        	Ba[i] = sc.nextInt();
        }
      	Integer[] Ca = new Integer[C];
      	for(int i = 0; i < C; i++){
        	Ca[i] = sc.nextInt();
        }
      	Arrays.sort(Aa, Collections.reverseOrder());
      	Arrays.sort(Ba, Collections.reverseOrder());
      	Arrays.sort(Ca, Collections.reverseOrder());
		Integer sum = 0;
      	Integer acnt = 0;
      	Integer bcnt = 0;
      	Integer ccnt = 0;
      	while(X>0){
          	if((acnt==Aa.length) && (ccnt==Ca.length)){
            	break;
            }
            if(acnt == Aa.length){
              sum += Ca[ccnt];
              ccnt++;
              X--;
              continue;
            }else if(ccnt == Ca.length){
              	sum += Aa[acnt];
              acnt++;
            	X--;
              	continue;
            }
          	if(Aa[acnt] >= Ca[ccnt]){
              	sum += Aa[acnt];
              	acnt++;
            }else{
            	sum += Ca[ccnt];
              	ccnt++;
            }
        	X--;
        }
      	while(Y>0){
            if((bcnt==Ba.length) && (ccnt==Ca.length)){
            	break;
            }
            if(bcnt == Ba.length){
              sum += Ca[ccnt];
              ccnt++;
              Y--;
              continue;
            }else if(ccnt == Ca.length){
              	sum += Ba[bcnt];
                bcnt++;
            	Y--;
              	continue;
            }
          	if(Ba[bcnt] >= Ca[ccnt]){
              	sum += Ba[bcnt];
              	bcnt++;
            }else{
            	sum += Ca[ccnt];
              	ccnt++;
            }
        	Y--;
        }
      
		System.out.println(sum);
	}
}