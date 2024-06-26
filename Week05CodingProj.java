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
		Logger logger2 = new SpacedLogger();
		logger2.log("test 3");
		logger2.error("test 4");
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
		// The little for loop here makes sure that the box fits the text nicely.
		for(int i = 0; i<(e.length() + 13); i++)
			System.out.print("*");
		System.out.println("\n***Error: " + e + "***");
		for(int i = 0; i<(e.length() + 13); i++)
			System.out.print("*");
		System.out.println(""); // Since the asterisks are printed without a newline, it has to print a blank newline to make sure the next thing printed is on a new line.
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
		System.out.println(space(e));
	}
	
	public void error(String e)
	{
		System.out.println("ERROR: " + space(e));
	}
}