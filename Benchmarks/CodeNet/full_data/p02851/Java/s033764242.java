int N,K;
ll A[202020];
ll S[202020];

void solve() {
	int i,j,k,l,r,x,y; string s;
	
	cin>>N>>K;
	map<ll,int> M;
	ll ret=0;
	M[0]=1;
	FOR(i,N) {
		cin>>A[i];
		S[i+1]=S[i]+A[i]+K-1;
		if(i+1-K>=0) M[S[i+1-K]%K]--;
		ret+=M[S[i+1]%K];
		M[(S[i+1])%K]++;
	}
	cout<<ret<<endl;
}