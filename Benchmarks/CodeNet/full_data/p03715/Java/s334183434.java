int x=H;
int y=W;
if(H*W%3==0) return 0;
else if(H<<W) return H*[W/2]-(W-[W/2])*[H/2];
else return [H/2]*W-(H-[H/2])*[W/2];