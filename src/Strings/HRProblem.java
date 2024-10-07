package Strings;

public class HRProblem
{
    public static void main(String[] args) {
        String s="ewlcometojava";
        int k=3;
        String[] arr=new String[s.length()-2];
        for(int i=0;i<s.length()-2;i++)
        {
            int j=k;
            while (j<s.length()+1)
            {
                String sb=s.substring(i,j);
                arr[i]=sb;
                k++;
                System.out.println(sb);
                break;
            }
        }
        for(String g:arr)
        {
            System.out.println(g);
        }


        for(int i=0;i< arr.length-1;i++)
        {
        String str1=arr[i];
            String str2=arr[i+1];
            if (str2.compareTo(str1)<0)

                System.out.println( str2+" is max");
            else System.out.println(str1+" is min");
        }
    }
}
