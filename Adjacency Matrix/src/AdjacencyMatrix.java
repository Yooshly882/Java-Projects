import java.util.ArrayList;
import java.util.Scanner;

public class AdjacencyMatrix {

	public static void main(String[] args) {
		
		ArrayList<Integer> vertList = new ArrayList<Integer>();
		ArrayList<Integer> edgeList = new ArrayList<Integer>();
		
		Scanner sc = new Scanner(System.in).useDelimiter(" *");
		System.out.print("Enter vertex list: ");
		
		while (sc.hasNextInt()) {
			vertList.add(sc.nextInt());
		}
		
		System.out.println("Enter list of edges for each given consecutive vertex: ");
		
		for (Integer i : vertList) {
			while (sc.hasNextInt()) {
				edgeList.add(i, sc.nextInt());
			}
			System.out.println(i + "" + edgeList);
		}
		sc.close();
	}

}
