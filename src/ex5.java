
public class ex5 {
	public static void main(String[] args) {
		int a=1;
		int b=2;
		int c=3;
		int d=4;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		int comodin = b;
		b=c;
		c=a;
		a=d;
		d=comodin;
		
		System.out.println();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		
	}

}
