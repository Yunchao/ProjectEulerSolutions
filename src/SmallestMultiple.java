
public class SmallestMultiple {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num = 2520;
		int answer = 0;
		boolean divisible = true;
		while(answer == 0)
		{
			divisible = true;
			for(int i = 1; i <= 20; i++)
			{
				if(num % i != 0)
				{
					divisible = false;
				}
			}

			if (divisible == true)
			{
				answer = num; 
			}
			num++;
		}
		System.out.print(answer);
	}

}