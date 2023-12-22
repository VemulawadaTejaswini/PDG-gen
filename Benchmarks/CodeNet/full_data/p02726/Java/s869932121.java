import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
	int X = sc.nextInt();
	int Y = sc.nextInt();

	int[] counter = new int[N];
	for(int i=1;i<N;i++){//頂点iから始まる
	    for(int k=1;k<=N-1;k++){//距離kのもの をカウント
		int nokori = k;
		int genzaichi = i;
		while(genzaichi < N){
		    if(genzaichi != X){
			genzaichi++;
			nokori--;
			if(nokori==0){
			    counter[k]++;
			    break;
			}
		    }else if(genzaichi == X){
			if(nokori >= Y-X){//遠回りしてYについてしまうのであればワープ
			    genzaichi = Y;
			    nokori--;
			    if(nokori==0){
				counter[k]++;
				break;
			    }
			}else{//ワープの有り無し選べる
			    int nokoriStock = nokori;
			    int genzaichiStock = genzaichi;
			    //ワープする
			    while(genzaichi < N){
				genzaichi = Y;
				nokori--;
				if(nokori==0){
				    counter[k]++;
				    break;
				}
			    }
			    
			    //ワープしない
			    while(genzaichiStock < N){
				genzaichiStock++;
				nokoriStock--;
				if(nokori==0){
				    counter[k]++;
				    break;
				}
			    }
			}
		    }
		}
	    }
	}
	for(int i=1;i<N;i++){
	    System.out.println(counter[i]);
	}
    }
}
