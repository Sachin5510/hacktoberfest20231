public class Hlogn {

	public static int cal(int x , int n) {
		if(n==0) {
			return 1;
			
		}
		if(x==0) {
			           
		return 0;
		}
	
		if(n%2==0) {
		return 	cal(x, n/2)* cal(x,n/2);
		}
		
		else {
			
			return cal(x,n/2) * cal(x,n/2)* x ;
		}
	}
		
	public static void main(String[] args) {
		int x = 2, n= 5;
		int ans= cal(x,n);
		System.out.println(ans);
	}

}
