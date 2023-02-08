class Browser {
	private static String url[]=new String[10]; //how we add new urls if array is static
	//fixed number doesn't change
	//entire history passed during declaration of object itself
	static int index=0;
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
		this.url[index]=s;
		index++;   //this cannot be used in static context
	}
	
	public String getURL(int j)
	{
		return url[j];
	}
	public void display()  
	{  
		System.out.println("Browser History \n");
		for(int i=0;i<10;i++)
			System.out.println(getURL(i)+"\n");
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
