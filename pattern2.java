class q2{
public static void main(String args[]){
pattern(8);
}
static void pattern(int n){
for(int i=1;i<=n;i++){
	for(int j=n-i-1;j>0;j--){
		System.out.print(' ');
		
		}
	for(int k=0;k<i;k++){
		System.out.print('*');
		System.out.print('*');
		
		}
	System.out.println();
	
	}
for(int i=1;i<=n;i++){
	for(int j=0;j<i;j++){
		System.out.print(' ');
		
		}
	for(int k=n-i;k>0;k--){
		System.out.print('*');
		System.out.print('*');
		
		}
	System.out.println();
	
	}
}}
