class Fibonacci
{
public static void main(String arg[])
{
int n1=0;
int n2=1;
int n=5;
System.out.println("Sum upto 5 terms:");
while (n>0){
System.out.println(n1);
int nth=n1+n2;
n1=n2;
n2=nth;
n--;
}
}
}