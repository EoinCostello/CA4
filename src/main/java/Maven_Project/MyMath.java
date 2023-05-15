package Maven_Project;

public class MyMath {
	public int myAdd(int a, int b) {
        // add Sum here
		return a+b;
	}
    public int mySubtract(int a, int b) {
        // add Sum here
    	return a-b;
    }
     public int myMultiply(int a, int b) {
        // add Sum here
    	return a*b;
    }
     public int myDivide(int a, int b) {
        // add Sum here
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }

}
