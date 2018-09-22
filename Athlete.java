class Athlete{
	int id;
	int hours,minutes,seconds;
	int Ehours,Eminutes,Eseconds;
	public Athlete(int id,int hours,int minutes,int seconds,int Ehours,int Eminutes,int Eseconds){
		this.id=id;
		this.hours=hours;
		this.minutes=minutes;
		this.seconds=seconds;
		this.Ehours=Ehours;
		this.Eminutes=Eminutes;
		this.Eseconds=Eseconds;
	}
	public int stimeh(){
		return hours;
	}
	public int stimem(){
		return minutes;
	}
	public int stimes(){
		return seconds;
	}
	public int etimeh(){
		return Ehours;
	}
	public int etimem(){
		return Eminutes;
	}
	public int etimes(){
		return Eseconds;
	}
	public int spentH(){
		int t1;
		
		return (Ehours-hours);
	}
	public int spentM(){
		return (Eminutes-minutes);
	}
	public int spentS(){
		int t3;
		if(Eseconds<seconds){
			t3=60-seconds+Eseconds;
		}
		else{
			t3=Eseconds-seconds;
		}
		return t3;
	}
	public int ttime(){
		int t=(Ehours-hours)*3600+(Eminutes-minutes)*60+(Eseconds-seconds);
		return t;
	}
	public double speed(){
		double t=(Ehours-hours)*3600+(Eminutes-minutes)*60+(Eseconds-seconds);
		double q=100/t;
		return (double)q;
	}
	public static void main(String[] args) {
		Athlete a1=new Athlete(10,8,45,52,9,15,58);
		System.out.println("\n\tIdentification number: \t"+a1.id);
		System.out.println("\nStarting time :  "+a1.stimeh()+":"+a1.stimem()+":"+a1.stimes());
		System.out.println("Ending time :    "+a1.etimeh()+":"+a1.etimem()+":"+a1.etimes()+"\n");
		System.out.println("The spent time:\n \n");
		System.out.println("\t Hours :"+a1.spentH());
		System.out.println("\t Minutes:"+a1.spentM());
		System.out.println("\t Seconds:"+a1.spentS()+"\n");
		System.out.println("Total time spent: "+a1.ttime()+"\n");
		System.out.println("Speed : "+a1.speed()+" m/s\n");
	}
}