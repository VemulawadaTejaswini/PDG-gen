s = input()

if((int)(s[0:2]) <= 12 and (int)(s[0:2]) >= 1) :
    if(int(s[2:]) <=12 and (int)(s[2:]) >=1):
        print("AMBIGUOUS")
    elif(int(s[2:]) <= 99 and (int)(s[2:]) >= 0):
        print("MMYY")
    else:
        print("NA")
elif ((int)(s[0:2]) <= 99 and (int)(s[0:2]) >= 0):
     if((int)(s[2:]) <=12 and (int)(s[2:]) >=1):
         print("YYMM")
     else:
         print("NA")
else:
    print("NA")
