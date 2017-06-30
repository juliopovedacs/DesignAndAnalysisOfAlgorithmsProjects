
public class BubbleSort implements NumbersArraySorter 
{

	@Override
	public void sort(double[] numbers) 
	{
		int n = numbers.length;
		
		//Inv: hasta donde va la i va ordenado
		for(int i = 0; i<n-2; i++)
		{
			for(int j=n-1; j>i; j--)
			{
				if(numbers[j-1]>numbers[j])
				{
					int number = (int) numbers[j-1];
					numbers[j-1] = numbers[j];
					numbers[j] = number;
				}
			}
				
		}				
	}
}

