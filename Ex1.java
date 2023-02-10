import java.util.*;

class Browser {
	private static ArrayList<String> url = new ArrayList<>();
	
	Browser(){
			setURL("url1");

	}
	Browser(String urlHistory[])	
	{
		int l=urlHistory.length;
		for(int i=0;i<l;i++)
			setURL(urlHistory[i]);
	}

	public void setURL(String s)
	{
		url.add(s);
	}
	
	public void display()  
	{  
		System.out.println("Browser History \n");
		for(int i=0;i<url.size();i++)
			System.out.println(url.get(i)+"\n");
	}
}

public class Demo
{
	public static void main(String args[])
	{
		String urlHistory1[]= {"url2","url3","url4"};
		Browser B1=new Browser();
		B1.display();
		Browser B2=new Browser(urlHistory1);
		B2.display();
		
	}
}
