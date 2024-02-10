// Java Week 05 Coding Project
// Letitia Pinter

package week05p;

public class App 
{

	public static void main(String[] args) 
	{
		System.out.println("test");
	}
	
}

public interface Logger
{
	public void log(String e);
	public void error(String e);
}

public class AsteriskLogger implements Logger
{
	public void log(String e)
	{
		System.out.println("***" + e + "***");
	}
	
	public void error(String e)
	{
		for(int i = 0; i<(e.length() + 13); i++)
			System.out.print("*");
		System.out.println("***Error: " + e + "***");
		for(int i = 0; i<(e.length() + 13); i++)
			System.out.print("*");
	}
}