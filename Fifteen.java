public class Fifteen
{
    public static void main (String args[ ]) 
    { 
    for (int i=1; i<=5; i++)
	{
	if (i==3)
	{
		System.out.println ("Skipping the for loop at 3");
		continue;
	}
	System.out.println ("Hello World");
	}
    } 
}
