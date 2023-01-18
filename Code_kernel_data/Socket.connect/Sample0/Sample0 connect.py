import re
with open('sample.txt') as fo:
    start=0
    op=''
    cntr=1
    for x in fo.read().split("\n"):
        if(re.match("^Instance\s.*\d$",x)):
            if (start==1):
                opf=open(str(cntr)+ '.txt','w') 
                opf.write(op)
                opf.close()
                op=''
                cntr+=1
            else:
                start=1
        
        else:
            if(op==''):
                op=x
        op=op+'\n' +x
            
    fo.close()
    print('completed')
