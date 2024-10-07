package DsaPatterns;

public class Traingles
{
    public static void main(String[] args)
    {
        int n=6;
        for (int i=0;i<n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("====================================");

        for (int i=0;i<n;i++)
        {
            for(int j=0;j<1+i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("====================================");


        for (int i=0;i<n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
                System.out.print(" ");
            }
            for (int k=0;k<1+i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("====================================");


        for (int i=0;i<n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
                System.out.print(" ");
            }
            for (int k=0;k<1+i;k++)
            {
                System.out.print("*");
            }
            for(int j=1;j<1+i;j++)
            {
                System.out.print("*");
            }
            for (int k=0;k<1+i;k++)
            {
                System.out.print("-");
            }
            System.out.println();
        }
        System.out.println("====================================");


        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
                System.out.print(" ");

            }

            for(int j=0;j<2*i+1;j++)
            {
                System.out.print("*");

            }

            System.out.println();
        }

        System.out.println("====================================");
        int m=7;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<1+i;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<m-i*2;j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }

        System.out.println("====================================");
        for(int i=n-1;i>=0;i--)
        {
            for(int j=0;j<m-i;j++)
            {
                System.out.print(" ");

            }
            for(int j=0;j<2*i+1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("====================================");


        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<1+i*2;j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }

        for(int i=n-2;i>=0;i--)
        {
            for(int j=0;j<n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<1+i*2;j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
        System.out.println("====================================");


        for(int i=n-1;i>=0;i--)
        {
            for (int j = 0; j < n - i; j++)
            {
                System.out.print(" ");
            }
            for (int j = 0; j < 1 + i * 2; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<1+i*2;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }




        System.out.println("====================================");


        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<1+i*2;j++)
            {
                if(i==n-1||j==0||j==2*i)
                {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }


        System.out.println("====================================");

        for (int i=0;i<n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
                System.out.print(" ");
            }
            for(int s=0;s<2*i+1;s++)
            {
                if(s==0||s==2*i||i==0)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        for (int i=n;i>=0;i--)
        {
            for(int j=0;j<n-i;j++)
            {
                System.out.print(" ");
            }
            for(int s=0;s<2*i+1;s++)
            {
                if(s==0||s==2*i||i==0)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
