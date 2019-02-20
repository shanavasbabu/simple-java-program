import java.io.*;
import java.lang.*;
import java.util.*;
class xpattern
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i,j,k,m,a=1;
        for(i=1,m=n+1;i<=n;i++,m-=2)
        {
            
            for(j=a;j>=1;j--)
            System.out.print(" ");
            for(k=i;k<=i;k++)
            System.out.print(k);
            if(m==n+1)
            System.out.print(" ");
            for(j=1;j<=m;j++)
            System.out.print(" ");
          
            if(i==n)
            {
                
            }
            else{
              for(k=i;k<=i;k++)
            System.out.print(k);}
              a+=1;
            System.out.println(" ");
        }
        a=2;
         for(i=n-1,m=1;i>=1;i--,m+=2)
        {
            for(j=a;j>=1;j--)
            System.out.print(" ");
            for(k=i;k<=i;k++)
            System.out.print(k);
            for(j=1;j<=m;j++)
            System.out.print(" ");
              for(k=i;k<=i;k++)
            System.out.print(k);
              a-=1;
            System.out.println(" ");
        }
    }
}


