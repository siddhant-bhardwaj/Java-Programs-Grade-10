/* Specify the class finder with the following overloaded functions:void findMax(int n1,int n2)-to 
 * print the largest of the 2 nos void findMax(int n1,int n2,int n3)-to print largest of 3 nos void main()-to 
 * call the above functions*/
 
 import java.util.*;
 class finder{
    int n1,n2,n3; 
    
    void findMax(int n1, int n2) 
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the first number");
    n1=sc.nextInt();
    System.out.println("Enter the second number");
    n2=sc.nextInt();
    System.out.println("The max number between the two is: "+Math.max(n1,n2));
    }
    
    void findMax(int n1, int n2, int n3) 
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the first number");
    n1=sc.nextInt();
    System.out.println("Enter the second number");
    n2=sc.nextInt();
    System.out.println("Enter the third number");
    n3=sc.nextInt();
    if(n1>n2 && n1>n3)
    System.out.println("The max number between the three is: "+n1);
    if(n2>n1 && n2>n3)
    System.out.println("The max number between the three is: "+n2);
    if(n3>n2 && n3>n1)
    System.out.println("The max number between the three is: "+n3);
    }
    
    void main()
    {
    findMax(n1,n2);
    findMax(n1,n2,n3);
    }
    } 