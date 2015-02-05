
public class Fibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int i = 0;
		int count = 0;
		while (b<4000000)
		{
			if(b % 2 == 0)
			{
				count = count + b;				
			}
			i = a + b;
			a = b;
			b = i;
		}
		System.out.print(count);
	}

}