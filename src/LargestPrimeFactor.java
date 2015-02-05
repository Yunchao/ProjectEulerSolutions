
public class LargestPrimeFactor {

	/**
	 * @param args
	 */

	public static boolean isPrime(long num){
		boolean prime = true;
		for (long j = 2; j <= num/2; j++)
		{
			if(num % j == 0)
			{
				prime = false;
			}
		}
		return prime;
	}
	
	public static void main(String[] args) {
		long largestFactor = 0;
		for (long i = 1; i <= Math.sqrt(600851475143L); i++)
		{
			if(600851475143L % i == 0)
			{
				if(isPrime(i) == true)
				{
					largestFactor = i;
				}
			}
		}
		System.out.println(largestFactor);
	}
}