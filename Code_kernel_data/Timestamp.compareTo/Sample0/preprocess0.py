import os
from pathlib import Path
import re
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


def snippetCopy(line, fptr,  wptr):

    """
    curr_path = path.split('/')[0]
    completeName = os.path.join(curr_path, file_name)
    print(completeName)
    newfile = open(completeName, "w+")
    """

    line = fptr.readline()  # read first line of snippet
    # removal of class\d\d and #\d
    wptr.write("public class func{")
    line = re.sub('Class\d+\.', '', line)
    line = re.sub('#\d+', '', line)

    wptr.write("\n\tpublic void"+" ")
    wptr.write(line)

    while True:
        line = fptr.readline()

        wptr.write(line)
        if line == "}\n":
            break
    wptr.write("}\n")
    
def readfile(path):
    
    # here we read the num.txt file and seperate the each instance into a seperate py file
    print("yeet")
    f = open(path, "r")

    file_name = path.split('/')[0]
    file_name=re.sub('.txt','.java',file_name)
         
    newfile = open(file_name, "w+")
    
            
    while f:
        line  = f.readline()
        
        if re.search("Instance \d+",line) != None:
            #meaning the line read has the word Instance
            number = line.split()[-1]
            newfile.write("//")
            newfile.write(number)
            newfile.write("\n")
            snippetCopy(line, f, newfile)

        if line == '':
            break
    newfile.close()
    f.close()


for dir, subdir, files in os.walk('.'):
    for name in files:
        if os.path.isfile(os.path.join(dir, name)):
            if Path(os.path.join(dir, name)).suffix == '.txt':
                curr_path = os.path.join(dir, name)[2:]
                print(curr_path)
                readfile(curr_path)
                os.remove(os.path.join(dir, name))


