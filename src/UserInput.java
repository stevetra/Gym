import java.io.*;
class UserInput 
{
	static int getInteger() 
	{
		String line;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try
		{
			line=br.readLine();
			int i=Integer.parseInt(line);
			return i;
		}
		catch(Exception e) 
		{
			return -1;
		}
	}
	static float getFloat() 
	{
		String line;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try
		{
			line=br.readLine();
			float i=Float.parseFloat(line);
			return i;
		}
		catch(Exception e) 
		{
			return -1;
		}
	}
	static double getDouble()
	{
        	String line;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try
		{
			line=br.readLine();
			double i=Double.parseDouble(line);
			return i;
		}
		catch(Exception e)
		{
 			return -1;
		}
	}
	static short getShort()
	{
        	String line;
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		try
		{
			line=br.readLine();
			short i=Short.parseShort(line);
			return i;
		}
		catch(Exception e)
		{
			return -1;
		}
	}
	static String getString()
	{
        	String line;
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		try
		{
			line=br.readLine();
			return line;
		}
		catch(Exception e)
		{
			return "Lathos";
		}
	}
}