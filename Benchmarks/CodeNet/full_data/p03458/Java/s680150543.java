		for(int i=0;i<N;i++){
			if(!booleans.get(i)){
				continue;
			}
			for(int w=0;w<K;w++){
				for(int h=0;h<K;h++){
					int pos = 0;
					for(int j=0;j<N;j++){
						if(c.get(i).equals(c.get(j))){
							if(((((((a.get(j)+w)/K)%2)+((b.get(j)+h)/K)%2)))%2==0){
								pos++;
							}
						}
						else{
							if(((((((a.get(j)+w)/K)%2)+((b.get(j)+h)/K)%2)))%2!=0){
								pos++;
							}
						}
					}
					if(max<pos){
						max = pos;
					}
					if(max==N){
						break;
					}
				}
			}
			if(max==N){
				break;
			}
		}
		System.out.println(max);
