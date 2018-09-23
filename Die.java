public class Die
{
  	private int face = 1;

 
  	public int getRoll ()  {
    		return face;
  }

 
	public int rollDie ()  {
    		face = (int)(Math.random()*6 + 1);
    		return face;
  }
	public static void main(String[] args){
		Die die1=new Die();
		Die die2=new Die();

		int x=die1.rollDie();
		int y=die2.rollDie();
		System.out.println("Die1 Value : "+x);
		System.out.println("Die2 Value : "+y);
		if (x+y==7){
			System.out.println("You Won.");
}
		else{
			System.out.println("You lost.");
}
}
	

}
