class prac{
void pattern(int i)
{
for(int a=5;a>=1;a--)
{
for(int b=5;b>=a;b--)
{
System.out.print(i+" ");
}
System.out.println();
i++;
}
}

void pattern(double j)
{
for(int a=5;a>=1;a--)
{
for(int b=1;b<=a;b++)
{
System.out.print(j+" ");
}
System.out.println();
j--;
}
}

void main()
{
int x=1;
double y=5;
prac obj=new prac();
obj.pattern(x);
obj.pattern(y);
}

}