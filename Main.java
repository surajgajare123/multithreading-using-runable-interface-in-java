class Mythreding implements Runnable{
    public void run(){
        System.out.println("hello i am threading 1....");
        System.out.println("hello i am threading 1....");
        System.out.println("hello i am threading 1....");
        System.out.println("hello i am threading 1....");
        System.out.println("hello i am threading 1....");
        System.out.println("hello i am threading 1....");
        System.out.println("hello i am threading 1....");
        System.out.println("hello i am threading 1....");
        System.out.println("hello i am threading 1....");
    }
}
class Mythreading2 implements Runnable{
     public void run(){
        System.out.println("hello i am threading 2....");
        System.out.println("hello i am threading 2....");
        System.out.println("hello i am threading 2....");
        System.out.println("hello i am threading 2....");
        System.out.println("hello i am threading 2....");
        System.out.println("hello i am threading 2....");
        System.out.println("hello i am threading 2....");
        System.out.println("hello i am threading 2....");
    }
}
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Mythreding bullet1 = new Mythreding();
		Thread gun1 = new Thread(bullet1);
		Mythreading2 bullet2 = new Mythreading2();
		Thread gun2 = new Thread(bullet2);
		gun2.start();
		gun1.start();
	
	}
	
}
