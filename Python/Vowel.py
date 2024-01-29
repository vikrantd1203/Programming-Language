str="yyy"
count=0

for i in str:
    if i=='a' or i=='e' or i=='i' or i=='o' or i=='u':
        count+=1

if count==0:
    print("No Vowel Present")
else:
    print("Vowel Present")
