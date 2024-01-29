public class Vowel{
    public static void main(String [] args)
    {
        String str="ptn";
        int count=0;

        for(char c:str.toCharArray())
        {
            if(c=='a' || c=='i' || c=='e' || c=='o' || c=='u')
            {
                count++;
            }
        }
            if(count>0)
            {
                System.out.println("Vowels Present");
            }
            else
            {
                System.out.println("Vowels Not Present");
            }
        
    }
}