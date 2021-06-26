import java.util.*;
class menu{
int ch1;
char ch2;
void main(){
Scanner sc=new Scanner(System.in);
do{
System.out.println("Choose the following option: \n 1)Accept a number and determine whether it is a prime number \n 2)Accept a number and give the factorial of the num.");
ch1=sc.nextInt();
switch(ch1){
case 1:
System.out.println("Enter the number");
int prime=sc.nextInt();
int c,h;
c=1;
h=0;
while(c<=prime){
if(prime%c==0){
h++;
}
else{
continue;
}
c++;
}
if(h==2)
System.out.println("It is a prime number");
else
System.out.println("It is not a prime number");

break;
case 2:
System.out.println("Enter the number");
int num=sc.nextInt();
int i=1;
int fact=1;
while(i<=num){
fact*=(fact*i);
i++;
}
System.out.println("The factorial number is "+fact);
break;
}
System.out.println("Type Y to continue and N to exit");
ch2=sc.next().charAt(0);
}
while(ch2=='Y');
}
}