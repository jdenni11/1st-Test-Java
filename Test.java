import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int [] numbers = new int[5];

	for(int i = 0; i < numbers.length; i++) {
		numbers[i] = i *10;
	}

	for(int i = 0; i < numbers.length; i++) {
		System.out.println(numbers[i]);
	}
	System.out.println();
	Scanner scan = new Scanner(System.in);

	String [] names = new String[3];

	names[0] = "Tim";
	names[1] = "Josh";
	names[2] = "Mike";

	for(int i = 0; i < names.length; i++) {
		System.out.println(names[i]);
	}
	}

}
