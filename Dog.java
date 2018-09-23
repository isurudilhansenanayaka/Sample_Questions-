public class Dog
{
	String Name,Type,Color,StomachState;
	int Age;

	public Dog(String n){
		Name=n;
}
	public void setName(String n){
		Name=n;
}
	public String getName(){
		return Name;
}

	public void setType(String t){
		Type=t;
}

	public String getType(){
		return Type;
}
	public void setColor(String c){
		Color=c;
}
	public String getColor(){
		return Color;
}
	public void setAge(int a){
		Age=a;
}
	public int getAge(){
		return Age;
}
	public void setStomachState(String s){
		StomachState=s;
}
	public String getStomachState(){
		return StomachState;
}

	public static void main(String[] args){
		Dog leader=new Dog("Leader");
		Dog lassy=new Dog("Lassy");
		lassy.setStomachState("Meats in stomatch");
		
		leader.setAge(1);
		lassy.setAge(1);
		System.out.println("Leader is "+leader.getAge()+" years old.");
}
}
