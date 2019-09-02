
public class euler7 {

	public static void main(String[] args) {
		int n=1;
		int a;
		int b=0;
		int prime=0;
		while(b!=10001)
		{
			a=0;
			n++;
			for(int i=1;i<n;i++)
			{
				if(n%i==0)
					a=a+1;
			}
		    if(a==2);
		    {
		    	b++;
		    	prime=n;
		    }
      }
		System.out.println("the 10001 prime no is "+ prime);
	}

}
