function isVowelPresent(str)
{
    const vowels=['a','e','i','o','u','A','E','I','O','U'];

    for(const char of str)
    {
        if(vowels.includes(char))
        {
            return true;
        }
    }
    return false;
}   

const inputstring="stack"

if(isVowelPresent(inputstring))
{
    console.log("Contains Vowel");
}
else
{
    console.log("No Vowels");
}