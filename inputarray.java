import java.util.Scanner;
public class inputarray
{

public static void main(String[] args) {
	int[] numArray=new int[100];
	int i,n,j,e;
	int temp;
	Scanner input=new Scanner(System.in);   //statement is used to use input functions       
		System.out.println(	"Enter Range: ");
	 n=input.nextInt();
	System.out.println(	"Enter array Elements: ");
	for(i=0;i<n;i++)
	{
		numArray[i]=input.nextInt();     //to take input from user
	}
	for(i=0;i<n;i++)
	{

		System.out.println(" array Elements:["  +i+"]= "+numArray[i]);
	}
	System.out.println("Sorting in process Ascending Order............");
	for(i=0;i<n;i++)
	{
		for(j=i+1;j<n;j++)
		{

			if(numArray[i]>numArray[j])
			{
      			temp=numArray[i];
      			numArray[i]=numArray[j];
      			numArray[j]=temp;
			}
		}
	}
	for(i=0;i<n;i++)
	{

		System.out.println("Sorted array Elements:["  +i+"]= "+numArray[i]);
	}
System.out.println("Sorting in process Descending Order............");
	for(i=0;i<n;i++)
	{
		for(j=i+1;j<n;j++)
		{

			if(numArray[i]<numArray[j])
			{
      			temp=numArray[i];
      			numArray[i]=numArray[j];
      			numArray[j]=temp;
			}
		}
	}
	for(i=0;i<n;i++)
	{

		System.out.println("Sorted array Elements:["  +i+"]= "+numArray[i]);
	}
	System.out.println("Exit = 1  Stay = 2");
    e=input.nextInt();
    if(e==1)
    {

    	System.exit(0);
    }
}

}