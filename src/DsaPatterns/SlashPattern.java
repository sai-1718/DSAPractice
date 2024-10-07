package DsaPatterns;

public class SlashPattern
{
    public static void main(String[] args)
    {
        int r=5;
        int c=5;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c-i;j++)
            {
                System.out.print(" ");
            }
            for(int m=0;m<3;m++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
