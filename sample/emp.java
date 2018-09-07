public class emp{
public String name;
public int salary;
public emp(String n){
name=n;
}
public void setsal(int z){
salary=z;
}
public void print(){
System.out.println(name);
System.out.println(salary);
}
public static void main(String[] args){
emp e1=new emp("kasun");
e1.setsal(25000);
e1.print();
}
}