public class Prime{
    public static void main(String [] args)
    {
        int num=2;
        int count=0;

        if(num<=1)
        {
            System.out.println("Not Prime");
        }

        for(int i=1;i<=num/2;i++)
        {
            if(num%i==0)
            {
                count++;
            }
        }

        if(count>1)
        {
            System.out.println("Prime Number");
        }
        else
        {
            System.out.println("Not Prime");
        }
    }
}