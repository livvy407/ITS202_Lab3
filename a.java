public class a    
{
	public static void Sort(int array[])
	{
		int n = array.length; //assign n variable as the length of array

		for(int j = 1; j < n; j++) //initialize j to the index of 1
		{
			int num = array[j]; //initialize num as same as j
			int i = j-1; //initialize i to the index j-1

			while( (i > -1) && ( array [i] > num )) //if the index of i is greater than -1 and the value in index 0 is greater than index of 
			{									    //num than it goes under while loop. 
				array[i+1] = array[i];
				i--; 
			}
			array[i+1] = num;
		}
	}

	public static void main(String a[])
	{ 
		int []arr = {6,2,8,4,9,1,0,4,3};
		System.out.println("Before insertion");

		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		System.out.println(" ");

		Sort(arr);

		System.out.println("After insertion");

		for(int i:arr)
		{
			System.out.print(i+" ");
		}
	}
}