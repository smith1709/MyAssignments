package assignments.week1;

public class Fibonnacci {

	public static void main(String[] args) {
int n = 10;
int [] a = new int[10]; 
a[0] = 0;
a[1] = 1;
int b = 0;

for ( int i = 2; i <= n-2; i++) {
	a[i] = a[i-1] + a [i-2];
	System.out.println( a[i]);
	
}
	}

}