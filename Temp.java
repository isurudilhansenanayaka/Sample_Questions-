class Temp
{
public static void main(String [] args)
{
int n=1;
int columns = 5;
for(int i=1;i<=5;i++)
{
for(int j=1;j<=columns;j++)
{
System.out.print(n+"\t");
n++;
}
columns–;
System.out.println();
}
}
}