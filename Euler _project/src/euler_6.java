
public class euler_6 {

	public static void main(String[] args) {
		int a=1;
		int b=20;
		int c=1;
		int sum;
		int sqsum;
		double diff;
		double sumsq;
		sum= (b*(2*a+(b-1)*c))/2;
		sumsq =Math.pow(sum, 2);
		sqsum =(b*(b+1)*(2*b+1))/6;
		diff=sumsq-sqsum;
		System.out.println("difference of sum of sq and sq of sum is "+diff);

	}

}
