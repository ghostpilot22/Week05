// Java Week 05 Coding Project
// Letitia Pinter

package week05p;

public class App 
{

	public static void main(String[] args) 
	{
		Logger logger = new AsteriskLogger();
		logger.log("test 1");
		logger.error("test 2");
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
		System.out.println("\n***Error: " + e + "***");
		for(int i = 0; i<(e.length() + 13); i++)
			System.out.print("*");
	}
}

public class SpacedLogger implements Logger
{
	// This private method takes a String and returns the spaced out version.
	private String space(String e)
	{
		char[] ee = e.toCharArray();
		StringBuilder eee = new StringBuilder();
		for(char c : ee)
		{
			eee.append(c);
			eee.append(" ");
		}
		return eee.toString();
	}
	
	public void log(String e)
	{
		
	}
	
	public void error(String e)
	{
		
	}
}