import java.util.*;
class prime
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your choice: ");
        int n=sc.nextInt();
        if(n==1)
        System.out.print("Neither prime nor composite");
        else
        {
        int f=0;
        for(int i=2;i<Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                f=1; break;
            }
        }
        if(f==0)
        System.out.println("Prime!!");
        else
        System.out.println("Not prime!!");
       }
    }
    
}