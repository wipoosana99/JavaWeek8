package week8;

public class java805 {
	public static void main(String[]args) {
		float a =5f;
		long b =10l;
		System.out.println("Implicit of total =  " + (a+b-7));
		
		short x,y,z;
		x=127;
		y=9;
		z=(short)(x+y);
		System.out.println("z is  " + z);
		long g = 123456789l;
		System.out.println("y = " + g);
		int k=250;
		g=k;
		byte s;
		s=(byte)x;
		System.out.println("g is now  "+ g + " and s is " + s);
	}
}
