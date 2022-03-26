import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class AdjacencyMatrix {

	public static void main(String[] args) throws InterruptedException {
		Lock lock = new ReentrantLock();
		Condition cond = lock.newCondition();
		ArrayList<Integer> vertList = new ArrayList<Integer>();
		ArrayList<String> edgeList = new ArrayList<String>();
		
		Scanner sc = new Scanner(System.in).useDelimiter(" *");
		System.out.print("Enter vertex list: ");
		
		while (sc.hasNextInt()) {
			vertList.add(sc.nextInt());
		}
		
		System.out.println("Enter list of edges for each given consecutive vertex: ");
		String zeroing = sc.nextLine();
		
		for (int i : vertList) {
			System.out.print(vertList.get(i) + ": ");
			String el = sc.nextLine();
			edgeList.add(el);
		}
		
		sc.close();
		printAdjMatrix(vertList, edgeList);
	}
	public static void printAdjMatrix(ArrayList<Integer> vList, ArrayList<String> eList) {
		for (int i : vList) {
			System.out.print("[ ");
			for (int j : vList) {
				if (eList.get(i).contains(vList.get(j).toString())) {
					System.out.print("1 ");
				}
				else {
					System.out.print("0 ");
				}
			}
			System.out.print("]\n");
		}
	}
}