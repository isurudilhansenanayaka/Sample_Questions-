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

class UStudent extends Student {
	private int cNum;
	private String subject;
	private String degree;
	public UStudent(String name,String gender,String dob,String regNo,int cNum,String subject,String degree){
		super(name,gender,dob,regNo);
		this.cNum=cNum;
		this.subject=subject;
		this.degree=degree;
	}
	public void display(){
		super.display();
		System.out.println("Combination Number : "+this.cNum+"\n"+"Subject : "+this.subject+"\n"+"Degree :  "+this.degree);
	}
}

class PStudent extends UStudent {
	private String status;
	private String program;
	private int amount_pay;
	public PStudent(String name,String gender,String dob,String regNo,int cNum,String subject,String degree,String program,int amount_pay,String status){
		super(name,gender,dob,regNo,cNum,subject,degree);
		this.program=program;
		this.amount_pay=amount_pay;
		this.status=status;
	}
	public void display(){
		super.display();
		System.out.println("Program : "+this.program+"\n"+"Amount Pay : "+this.amount_pay+"\n"+"Status : "+this.status);
	}
}
class AcadeEmp extends Employee{
	private String field_study;
	private String degree_held;
	public AcadeEmp(String name,String gender,String dob,String empNo,int bSalary,int leaves,String deduction,int noPay,String field_study,String degree_held){
		super(name,gender,dob,empNo,bSalary,leaves,deduction,noPay);
		this.field_study=field_study;
		this.degree_held=degree_held;
	}	
	public void display(){
		super.display();
		System.out.println("Field Study : "+this.field_study+"\n"+"Degree held : "+this.degree_held);	
	}
}
class NonAcadeEmp extends Employee{
	private String department;
	private int ot_hours;
	private int ot_hour_pay;
	public NonAcadeEmp(String name,String gender,String dob,String empNo,int bSalary,int leaves,String deduction,int noPay,String department,int ot_hours,int ot_hour_pay){
		super(name,gender,dob,empNo,bSalary,leaves,deduction,noPay);
		this.department=department;
		this.ot_hours=ot_hours;
		this.ot_hour_pay=ot_hour_pay;
	}	
	public void display(){
		super.display();
		System.out.println("Department Name : "+this.department+"\n"+"Overtime Hours : "+this.ot_hours+"\n"+"OT Hours Pay :"+this.ot_hour_pay);	
		System.out.println("Total Salary : "+totSalary(bSalary,ot_hours,ot_hour_pay));
	}
	public double totSalary(int bSalary,int ot_hours,int ot_hour_pay){
		return (bSalary+calculateEPF(bSalary)+ot_hour_pay*ot_hours);
	}
}
class PermanentEmp extends AcadeEmp{
	private int trave_allow;
	private int resea_allow;
	public PermanentEmp(String name,String gender,String dob,String empNo,int bSalary,int leaves,String deduction,int noPay,String field_study,String degree_held,int trave_allow,int resea_allow){
		super(name,gender,dob,empNo,bSalary,leaves,deduction,noPay,field_study,degree_held);
		this.trave_allow=trave_allow;
		this.resea_allow=resea_allow;
	}	
	public void display(){
		super.display();
		System.out.println("Travelling allowencess : "+this.trave_allow+"\n"+"Research allowencess : "+this.resea_allow);
		System.out.println("Total Salary : "+totSalary(trave_allow,resea_allow,bSalary));	
	}
	public double totSalary(int trave_allow,int resea_allow,int bSalary){
		return (resea_allow+trave_allow+bSalary+calculateEPF(bSalary));

	}
}
class TempEmp extends AcadeEmp{
	private String duration;
	public TempEmp(String name,String gender,String dob,String empNo,int bSalary,int leaves,String deduction,int noPay,String field_study,String degree_held,String duration){
		super(name,gender,dob,empNo,bSalary,leaves,deduction,noPay,field_study,degree_held);
		this.duration=duration;
	}	
	public void display(){
		super.display();
		System.out.println("Duration : "+this.duration);	
		System.out.println("Total Salary : "+totSalary(bSalary));
	}
	public double totSalary(int bSalary){
		return (bSalary+calculateEPF(bSalary));
	}
}