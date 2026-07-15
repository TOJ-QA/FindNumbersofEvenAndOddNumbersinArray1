package day6;

public class FindNumbersofEvenAndOddNumbersInArray {

	public static void main(String[] args) 
	{
			int numbers[] = {2, 5, 8, 57, 66, 571, 658, 531, 113, 279, 65, 188, 790};
			int evenCounter = 0;
			int oddCounter = 0;
			
			for (int i=0; i<numbers.length; i++)
			{
				if (numbers[i]%2 == 0)
				{
					//System.out.println("even number");
					evenCounter = evenCounter+1;
				}
				else
				{
					//System.out.println("odd number");
					oddCounter = oddCounter+1;
				}
			}
			
			System.out.println("Number of even numbers: "+evenCounter);
			System.out.println("Number of odd numbers: "+oddCounter);

		}

	}
