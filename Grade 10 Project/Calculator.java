/*Write a program to define the foll functions:

1) void product(int a, int b)-calculate the product of 2 nos and print the result

2) void sum(int a, int b)-calculate the sum of 2 nos and print

3) main() –to accept 2 nos from the user and to call the above two functions*/

import java.util.*;
class Calculator
{
int no1,no2;
char A;
void product(int a,int b)
{
int pro=a*b;
System.out.println("The product of the 2 numbers are "+pro);
}
void sum(int a,int b)
{
int sum=a+b;
System.out.println("The sum of the 2 numbers are "+sum);
}
void main()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the 2 numbers");
no1=sc.nextInt();
no2=sc.nextInt();
System.out.println("Enter a character");
A=sc.next().charAt(0);
Calculator obj=new Calculator();
obj.product(no1,no2);
sum(no1,no2);
}
}