public class Calculator
{
	int n1,n2;
	int tot=0;
	public Calculator(int x,int y){
		n1=x;
		n2=y;		
}
	public void Add(){
		tot=n1+n2;
}
	
	public void Subtract(){
		tot=n1-n2;
}

	
	public void Multiply(){
		tot=n1*n2;
}

	
	public void Devide(){
		tot=n1/n2;
}
	public double show(){
		return tot;
}

	public static void main(String[] args){
		Calculator c1=new Calculator(10,6);
		c1.Devide();
		System.out.println(c1.show());

}
}
