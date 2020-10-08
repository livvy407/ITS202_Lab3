public class b
{  
    public static void selectionSort(int[] array)
    {  
        for (int i = 0; i < array.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < array.length; j++)
            {  
                if (array[j] < array[index])
                {  
                    index = j; 
                }  
            }  
            int lowerNum = array[index];   
            array[index] = array[i];  
            array[i] = lowerNum;  
        }  
    }    
    public static void main(String a[])
    {  
        int[] array1 = {9,14,3,2,43,11,58,22};  
        System.out.println("Before Sort");  
        for(int i:array1)
        {  
            System.out.print(i+" ");  
        }  
            System.out.println();  
          
        selectionSort(array1); 
         
        System.out.println("After Sort");

        for(int i:array1)
        {  
            System.out.print(i+" ");  
        }  
    }  
}