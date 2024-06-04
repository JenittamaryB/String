package Stringdemo;


public class LearnString {
	public static void main(String[] args) {
		LearnString l=new LearnString();
		//l.printChar();
        //l.findLetter();
        //l.findVowels();
		//l.userStartWith();
        //l.userEndsWith();
		//l.stringCharSort();
		//l.replaceCharToInt();
		//l.replaceCharToInt1();
		l.removeDuplicate();
		//l.freq();
		//l.unique();
		//l.freq1();
		//l.upperLowerCase();
		}
	public void printChar()
	{
		String name="duck";
		//for(int i=name.length()-1;i>=0;i--)//length is method() in string
		for(int i=0;i<name.length();i++)
		{
			System.out.println(name.charAt(i));//is used to seprate the string to char
		}
		System.out.println(name.endsWith("k"));//default method for check endwith given letter
		System.out.println(name.startsWith("duc"));
		System.out.println(name.contains("ndj"));//this method for  given string is in name 
	}
	public void findLetter() 
	{
		String name="donaldduck";
		//String name1="donal";
		 //char key='d';
		 char key=' '; //to print how many space in given name
		 int count=0;
		for(int i=0;i<name.length();i++)
		{
   if(name.charAt(i)==key)
  {
	   System.out.println("yes:");
	 count++;
  }
	}
		 System.out.println("no of time is: "+count);
}
	
	
	public void findVowels()
	{
		String name="javadeveloper";
		int count=0;
		
		for(int i=0;i<=name.length()-1;i++)
		{
			char ch=name.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				count++;
			}
				
		}
		System.out.println("vowels count:"+count);
	}
	
	
	public void userStartWith()
	{
		String name="javadeveloper";
		int count=0;
		String name1="java";
		for(int i=0;i<=name1.length()-1;i++)
		{
		if(name.charAt(i)==name1.charAt(i))
		{
			count++;//4
			
		}			
		}
		if(count==name1.length()) //4==4
		{
		
		System.out.println("yes");
	}
		else {
			System.out.println("no");
		}
}
	public void userEndsWith()
	{
		String name="javadeveloper";
		boolean ends=true;
		String name1="developer";
		int len1=name.length();
		int len2=name1.length();
		
		for(int i=1;i<=name1.length();i++)
		{
		if(name.charAt(len1-i)!=name1.charAt(len2-i))
		{
			ends=false;
			break;
		}
		}
		 if(ends==true) 
		 {
		System.out.println("yes");
	    }
		else
		{
			System.out.println("no");
		}
		}
	public void stringCharSort()
	{
		String name="java";
		char []arr=name.toCharArray();//'j','a','v','a'
		char temp;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])//j>a
				{
					temp=arr[i];//temp=j
					arr[i]=arr[j];//arr[i]=a
					arr[j]=temp;//arr[j]=j
				}
			}	
		}
		System.out.println(arr);
		
		//another way for Stringcharsort using array
		/*String name="batman";
		char arr[]=name.toCharArray();//'j','a','v','a'
		Arrays.sort(arr);
		String sort=new String(arr);
		System.out.println("sorted.."+sort);*/
	}
	public void replaceCharToInt() {
		String name="barbieb";
		char key='b';
		int count=1;
		
		System.out.println("before..");
		System.out.println(name);
		System.out.println();
		
		System.out.println("after..");
		for(int i=0;i<name.length();i++)
		{
			if(name.charAt(i)==key)
			{
				
				System.out.print(count);
				count++;
			}
			else 
			{
				System.out.print(name.charAt(i));
			}
		}
	}
	public void replaceCharToInt1() 
	{
		String name="boommoob";//b132457b
		System.out.println("before.."+name);
		char key1='o';
		char key2='m';
		int count1=1;
		int count2=2;
		for(int i=0;i<name.length();i++)
		{
			if(name.charAt(i)==key1)
			{
				System.out.print(count1+" ");
				count1+=2;
			}
			else if(name.charAt(i)==key2) 
			{
				System.out.print(count2+" ");
				count2+=2;
			}
			else
			{
				System.out.print(name.charAt(i)+" ");
			}
		  }
	    }
	
	private void removeDuplicate() 
	{
		String str = "java";
		char[] arr = str.toCharArray();
		StringBuilder sb3 = new StringBuilder();//default class
		for (int i = 0; i < arr.length; i++)
		{
			boolean repated = false;
			for (int j = i + 1; j < arr.length; j++)
			{
				if (arr[i] == arr[j]) //j==a j==v j==a
				{                   //a==v  a==a break 
					repated = true;
					break;
				}
			}
			if (repated==false)//not equal to repeated 
			{
				sb3.append(arr[i]);//jva
			}
		}
		System.out.println(sb3);//jva
	}
	
	
	
	private void freq() 
	{
		int []arr1= {10,20,30,40,50,50};
		int arr[]=new int[arr1.length];
			  for(int i=0; i<arr1.length; i++) 
			  {
				  int count = 1;
				  for(int j=i+1; j<arr1.length; j++) 
				  {
					  if(arr1[i] == arr1[j]) {
						  count++;
						  arr1[j]=0;
					  }
				  }
				  if(arr1[i]!=0) {
					  System.out.println(arr1[i]+" appears "+count+" times");
				  }
			  }  
		}
	private void freq1() 
	{
			 String name = "batmanb";
			  char[] arr = name.toCharArray();
			  for(int i=0; i<arr.length; i++)
			  {
				  int count = 1;
				  for(int j=i+1; j<arr.length; j++) 
				  {
					  if(arr[i] == arr[j]) {
						  count++;
						  arr[j]=0;
					  }
				  }
				  if(arr[i] != 0) {
					  System.out.println(arr[i]+" appears "+count+" times");
				  }
			  }  
		}
	private void unique() 
	{
		int []arr1= {10,20,30,40,50,50};
		int arr[]=new int[arr1.length];
			  for(int i=0; i<arr1.length; i++)
			  {
				  int count = 1;
				  for(int j=i+1; j<arr1.length; j++) 
				  {
					  if(arr1[i] == arr1[j]) 
					  {
						  count++;
						  arr1[j]=0;
					  }
				  }
				  if(count==1) {
					  System.out.println(arr1[i]+" appears "+count+" times");
				  }
			  }  
		}
	public void upperLowerCase() {
		    String str = "Hello, World!";
	        String upperStr = str.toUpperCase();
	        System.out.println("Uppercase string: " + upperStr);
	        
	        String lowerStr = str.toLowerCase();
	        System.out.println("Lowercase string: " + lowerStr);

	        String modifiedStr = str.substring(0, 3) + Character.toUpperCase(str.charAt(3)) + str.substring(4);        
	        System.out.println("Modified string: " + modifiedStr);//change 3index to uppercase
	        
	       }
	        
	    
	}



