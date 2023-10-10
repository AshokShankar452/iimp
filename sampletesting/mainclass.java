package sampletesting;

public class mainclass extends IMP{
	public mainclass() {
		System.out.println("this is the constructor of mainclass");
	}

	public static void main(String[] args) {
		
		dummy n = new dummy();
		n.method2dummy();
		
		dummy b = new dummy();
		b.method2dummy();

		
	}		
	}