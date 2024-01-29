n=17

if n<=1:
    print("Not Prime")

if n>1:
    for i in range(2,int(n/2)+1):
        if(n%i==0):
            print("Not Prime")
            break
    else:
        print("Prime")