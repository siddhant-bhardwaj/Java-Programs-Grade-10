/*Design a class name ShowRoom with the following description:Instance variables
 * / Data members:String name -To store the name of the customerlong mobno -
 * To store the mobile number of the customerdouble cost -To store the cost of the 
 * items purchaseddouble dis -To store the discount amountdouble amount-To store the amount 
 * to be paid after discountMember 
 * methods:
 * ShowRoom() -default constructor to initialize data members 
 * void input()-To input customer name, mobile number, cost   
 * void calculate () -To calculate discount on the cost of purchased items,
 * based on followingcriteria
   void display () -To display customer name, mobile number , amount to be paidafter discount.
   Write a main method to create an object of the class and call the above member methods.
   */
 
 import java.util.*;
 class ShowRoom{
    String name;
    long mobno;
    double cost;
    double dis;
    double amount;
    
    void main()
    {
        ShowRoom obj=new ShowRoom();
        obj.input();
        obj.calculate();
        obj.display();
    }
    
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        name=sc.nextLine();
        System.out.println("Enter your mobile number");
        mobno=sc.nextLong();
        System.out.println("Enter the cost");
        cost=sc.nextDouble();
    }
    
    void calculate()
    {
        if(cost>0 && cost<=10000)
        {
        dis=0.05;
        }
        
        else if(cost>10000 && cost<=20000) 
        {
        dis=0.1;
        }
        
        else if(cost>20000 && cost<=35000)
        {
        dis=0.15;
        }
        
        else if(cost>35000)
        {
        dis=0.2; //calculating discount based on condition
        }
        
        amount=cost-(cost*dis); //calculating the amount
    }
    
    void display()
    {
    System.out.println("Your name is: "+name);
    System.out.println("Your mobile no is: "+mobno);
    System.out.println("Final amount to be paid: "+amount);
    }
    
    }