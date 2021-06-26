import java.util.*;
class menu{
int choice;

void main()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the choice");
choice=sc.nextInt();
     switch(choice) 
     {
        case 1:
        
        for(int i=4;i>=1;i--)
        {
        for(int j=4;j>=i;j--) 
        {
      
        System.out.print(j);
        
        }
        System.out.println(" ");
        }
        break;
        case 2:
        int b=1;
        for(int i=1;i<=4;i++)
        {
        for(int j=1;j<=i;j++) 
        {
        System.out.print(b);
        b++;
        }
        System.out.println(" ");
        }
        break;
     }
     
     
}

}