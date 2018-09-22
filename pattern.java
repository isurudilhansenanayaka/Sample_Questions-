class q1{
public static void main(String args[]){
pattern1(8);
pattern2(10);
pattern3(7);
pattern4(8);
}
static void pattern1(int n){
for(int i=1;i<=n;i++){
for(int j=1;j<=n;j++){
System.out.print('*');
System.out.print(' ');
}
System.out.println();
}
}


static void pattern2(int n){
System.out.print("\n");
for(int i=1;i<=n;i++){
	for(int j=1;j<=n;j++){
		if(i==1||i==n||j==1){
			System.out.print('*');
			System.out.print(' ');
			}
		else if(j<n){
			System.out.print(' ');
			System.out.print(' ');
			}
		else if(j==n){
		System.out.print('*');
			}
		}		
System.out.println();
	}
}
static void pattern3(int n){
System.out.print("\n");
for(int i=1;i<=n;i++){
	for(int j=1;j<=i;j++){
		System.out.print('*');
		System.out.print(' ');
		}		
	System.out.println();
	}
}

static void pattern4(int n){
System.out.print("\n");
for(int i=1;i<=n;i++){
	for(int j=2;j<=i;j++){
		System.out.print(' ');
		System.out.print(' ');
		}
	for(int k=n-i;k>0;k--){
		System.out.print('*');
		System.out.print(' ');
		}		
	System.out.println();
	}
}

}
