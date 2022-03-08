
public class fizzBuzz {
	
	/*I chose to make the start and end global constants, for an easy means of swapping
	 *the start and end of the loop.
	 */
final static int START = 1;
final static int END = 100;

	public static void main(String[] args) {
		for (int i = START; i <= END; i++) {
			if (i % 3 == 0) {
				System.out.print("Fizz");
			}
			else if (i % 5 == 0) {
				System.out.print("Buzz");
			}
			else {
				System.out.print(i);
			}
			System.out.print(", ");
		}
	}
}
