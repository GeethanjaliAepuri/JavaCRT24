class StackLL
{
public static void main (String args[])
{
	Scanner s=new Scanner(System.in);
	MyStack s1=new MyStack();
	for(;;)
	{
	System.out.println();
	System.out.println("1.PUSH\n2.POP\n3.PRINT\n4.EXIT");
	System.out.println("Enter your choice");
	int ch=s.nextInt();
	if(ch==1)
	{
		System.out.println("Enter an element");
		int x=s.nextInt();
		s1.push(x);
	}
	else if(ch==2)
		s1.pop();
	else if(ch==3)
		s1.display();
	else if(ch==4)
		break;
	else
		System.out.println("Invalid choice");
	}
}
}
