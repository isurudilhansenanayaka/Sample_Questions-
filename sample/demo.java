public class demo{
public static void main(String args[]){
student p1=new student("kasun",25,12);
p1.getage();
p1.getname();
}
}


class person {
String name;
int age;
person (String n,int a){
name=n;
age=a;
}
public void getname(){
System.out.println(name);
}
public void getage(){
System.out.println(age);
}
}

class student extends person{
int id;
student(int i){
id=i;}
public void getid(){
System.out.println(id);
}
}