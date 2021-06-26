/*Write a non-static function name d addition to
 * accept two integers and return the addition of the arguments. 
 * Write a public static void main function to invoke the addition function.*/
 import java.util.*;
 class add{
    int a,b;
    int add,ans;
    void main()
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Write the first number to be added");
    a=sc.nextInt();
    System.out.println("Write the second number to be added");
    b=sc.nextInt();
    add obj=new add();
    ans=obj.addition(a,b); //Storing the addition product in ans
    System.out.println("The sum is: "+ans);
    }
    
    int addition(int no1,int no2)
    {
    add=no1+no2;
    return add;// returning the addition product
    }
    }