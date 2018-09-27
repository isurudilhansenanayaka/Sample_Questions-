class Average{
            	int p,q,r;
            	float n,m,o;
		double avg,a,b;
            	Average(int x,int y){
                	p=x;
            		q=y;
			avg=(p+q)/2;
}
		Average(int x,int y,int z){
                	p=x;
            		q=y;
			r=z;
			avg=(p+q+r)/3;
}		

		Average(int x,float y){
                	p=x;
            		n=y;
			avg=(p+n)/2;
}
		Average(int x,int y,float z){
                	p=x;
            		q=y;
			n=z;
			avg=(p+q+n)/3;
}		
		Average(float x,float y,float z){
                	n=x;
            		m=y;
			o=z;
			avg=(n+m+o)/3;
}
		Average(float x,float y,int z,int a){
                	n=x;
            		m=y;
			p=z;
			q=a;
			avg=(n+m+p+q)/4;
}
		Average(double x,double y){
                	a=x;
            		b=y;
			avg=(a+b)/2;
}
		Average(int x,double y , float z){
                	p=x;
            		a=y;
			n=z;
			avg=(p+a+n)/3;
}
		public void getAvg(){
			System.out.println(avg);
}
                       
			public static void main(String[] args)
                         {
                              	Average twont = new Average(50.0,30.5);
				twont.getAvg();
				Average threefloat = new Average(50,21.0,19);
				threefloat.getAvg();
                        }
            
}
