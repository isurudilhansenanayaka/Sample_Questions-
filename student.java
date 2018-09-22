class student{
static int regNo,mark_cs,mark_stac,mark_math;
char g,grade;
String name,dob;
static double average;

static void Average(int c,int s,int m){
mark_cs=c;
mark_stac=s;
mark_math=m;
average=(float)(c+s+m)/3;
System.out.println(average);
}
static void Grade(){

if(average>=75)
System.out.print("A");
else if(average>=65){
System.out.print("B");}
else if(average>=55)
System.out.print("C");
else if(average>=45)
System.out.print("S");
else
System.out.print("F");
}
String display(String n){
n=name;
String z=Grade();
System.out.print(name);
System.out.print(average);
System.out.print(z);
}
public static void main(String args[]){
student.Average(60,60,61);
Grade();
}
}
