public class Integer_Array
{
	public static void main(String[] args) {
	//array is collection of similar type of elements
	/* declaration of an array
	   data_type[] array_name;
	   
	   initialization of an array
	   data_type[] array_name=new data_type[size_of_array];
	   
	   */
	   int[] arr;
	   arr=new int[5];
	   for(int i=0;i<5;i++)
	   {
	       arr[i]=i;
	   }
	   for(int i=0;i<5;i++)
	   {
	       System.out.println(arr[i]);
	   }
	}
}
