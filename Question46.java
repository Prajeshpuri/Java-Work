import java.lang.Thread;
class Question46
{
	public static void main(String[] args) 
	{
		Thread t=Thread.currentThread();
		System.out.println("current thread is "+ t);
		System.out.println("the name of thread is "+ t.getName());
		t.setName("prajesh");
		System.out.println("current thread is "+ t);
		System.out.println("the name of thread is "+ t.getName());
	}
}