import java.util.Scanner;
public class oops_assign {
            int real;
            	int img;
	public static void display(oops_assign s) {
		System.out.println("Real is "+s.real);
		System.out.println(" Imaginary is "+s.img);
		System.out.println("Thus the complex no. is"+s.real+"+"+s.img+"i" );
	}
	static int rsum(oops_assign x,oops_assign y) {
		int sumr=x.real+y.real;
		return sumr;
	}         static int isum(oops_assign x,oops_assign y) {
		int sumi=x.img+y.img;
		return sumi;
	}
	public static void main(String[]args) {
		Scanner xy=new Scanner(System.in);
		oops_assign a=new oops_assign();
		oops_assign b=new oops_assign();
		oops_assign c=new oops_assign();
		System.out.println("Enter the first complex number");
		a.real=xy.nextInt();
		a.img=xy.nextInt();
		a.display(a);
		System.out.println("Enter the 2nd complex number");
		b.real=xy.nextInt();
		b.img=xy.nextInt();
		b.display(b);
		c.real=rsum(a,b);
		c.img=isum(a,b);
		System.out.println("The sum of two complex number is ");
		c.display(c);
		
	
		
	

	}

}
