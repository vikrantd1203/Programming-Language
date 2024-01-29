function isPrime(num)
{
    if(num<=1)
    {
        return false;
    }

    for(let i=2;i<=(num/2);i++)
    {
        if(num%i==0)
        {
            return false;
        }
    }
    return true;
}

const input_integer=79

if(isPrime(input_integer))
{
    console.log("Prime Number");
}
else
{
    console.log("Not a Prime Number");
}