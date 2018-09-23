public class Number
{

	int num=0;

	
	public void inc(){
		num++;
	}
	
	public void inc(int n){

		num+=n;
	}

	public void dec(){

		num--;
	}

	public void decc(int n){

		num-=n;
	}

	public void negation(){

		num*=-1;
}

	public int show(){

		return num;
}

	public class Operation extends Number{

		int tot;

	public void Addition(int x,int y){

		tot=x+y;
}

	public void mult(int x,int y){

		tot=x-y;
}

	public int show(){
	
		return tot;}
 

	
public static void main(String[] args){

		Number n1=new Number();	

		n1.inc();

		n1.inc(5);

		n1.negation();
	
	System.out.println(n1.show());

		Number n2=new Number();
	
		n2.inc(10);

		System.out.println(n2.show());


		Number o1=new Operation();

		o1.Addition(n1.show(),n2.show());

		System.out.println(o1.show());

	}

}

