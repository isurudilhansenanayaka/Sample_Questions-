import java.util.Scanner;
public class Appointment
{
	String name="";
	String day="";
	String duration="";
	
	public void setName(String person)
	{
		this.name=person;
	}
	
	public String getName()
	{
		return name;
	}
	public void setDay(String date)
	{
		this.day=date;
	}
	
	public String getDay()
	{
		return day;
	}
	public void setDuration(String dura)
	{
		this.duration=dura;
	}
	
	public String getDuration()
	{
		return duration;
	}
	
	
	public static void main(String[] args)
	{
		Appointment p1= new Appointment();
		Appointment p2= new Appointment();
		
		//person 1 details............... 
		Scanner sc1=new Scanner(System.in);
		System.out.print("Enter appointment one person: ");
		String name1=sc1.next();
		p1.setName(name1);

		Scanner sc2=new Scanner(System.in);
		System.out.print("Enter day of the appointment one: ");
		String date1=sc2.next();
		p1.setDay(date1);

		Scanner sc3=new Scanner(System.in);
		System.out.print("Enter the duration of appointment one: ");
		String dura1=sc3.next();
		p1.setDuration(dura1);

		//person 2 details............... 
		Scanner sc4=new Scanner(System.in);
		System.out.print("Enter appointment two person: ");
		String name2=sc4.next();
		p2.setName(name2);

		Scanner sc5=new Scanner(System.in);
		System.out.print("Enter day of the appointment two: ");
		String date2=sc5.next();
		p2.setDay(date2);

		Scanner sc6=new Scanner(System.in);
		System.out.print("Enter the duration of appointment two: ");
		String dura2=sc6.next();
		p2.setDuration(dura2);

		
		System.out.println("You have a "+p1.getDuration()+" hour appoinment on " +p1.getDay()+"  with "+p1.getName());
		
		System.out.println("You have a "+p2.getDuration()+" hour appoinment on " +p2.getDay()+" with "+p2.getName());
		
	}
}
