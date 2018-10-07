class Univer_mem{
	String name;
	String gender;
	String dob;
	public Univer_mem(){}
	public Univer_mem(String name,String gender,String dob){
		this.name=name;
		this.gender=gender;
		this.dob=dob;
	}
	public void display(){
		System.out.println("Name :-"+this.name+"    Gender :-"+this.gender+"    Date of birth :-"+this.dob);
	}
	public static void main(String[] args) {
		Student s1=new Student("Amila Gunarathne","M","12/03/1989","S/09/001");
		s1.display();
		System.out.println();
		Employee emp1=new Employee("Samantha Perera","M","05/03/1975","Emp10",25000,1,"Null",0);
		emp1.display();
		System.out.println();
		PermanentEmp pemp1=new PermanentEmp("Thushari Gamage","F","07/04/1960","Emp01",35000,0,"Null",0,"Computer Science","PhD in Software Engineering",1000,0);
		pemp1.display();
		System.out.println();
		UStudent us1=new UStudent("Malaka Senadeera","M","21/09/1982","S/04/223",31,"Computer Science","Bsc");
		us1.display();
		System.out.println();
		PStudent ps1=new PStudent("Kaushalya Abesundara","F","18/05/1976","S/04/338",26,"Computer Science, Statistics,Mathematics","Bsc","Msc",120000,"5% fund");
		ps1.display();
	}

}
class Student extends Univer_mem{
	 String regNo;
	public Student(String name,String gender,String dob,String regNo){
		super(name,gender,dob);
		this.regNo=regNo;
	}
	public void display(){
		super.display();
		System.out.println("Regestem NO : "+this.regNo);
	}
}