
public class MethodByMethod {

	public static void main(String[] args) {   // main method 

		rank(40);
		int jj = marks(10);
		System.out.println(jj);

	}

	public static void rank(int sum) {        // rank method, type void, 

		if (sum == 100) {
			System.out.println(" topper ");
		} else if ((sum < 100) && (sum <= 50)) {

			System.out.println("avarage");
		} else {
			System.out.println(" below avarage   ");
		}
	}

	public static int marks(int mt) {   // return value is int 
		// int mt = 10;
		int sc = 10;
		if (mt == 10) {
			return 4;

		} else
			return 6;
	}

}
