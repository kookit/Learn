
public class HelloWorldApp {

	// Instance Methods
	public void printMessage (){
		System.out.println("Hello World!");
	}
	// Class methods
	public static void main (String args[]){
		HelloWorldApp app = new HelloWorldApp ();
		app.printMessage ();
	}
}
