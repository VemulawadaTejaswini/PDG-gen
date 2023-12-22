yohou = input()
result = input()

count = 0
for i in range(len(yohou)):
    if yohou[i] == result[i]:
        count+=1
print(count)
