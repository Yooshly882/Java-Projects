import java.util.Scanner;

public class AdjacencyMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String vList = sc.nextLine();
		String edgeList = null;
		
		while (sc.hasNextLine()) {
			edgeList = edgeList + sc.nextLine() + ", ";
		}
		sc.close();
		
		System.out.println(vList);
		System.out.println(edgeList);
	}

}
