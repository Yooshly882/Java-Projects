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
		System.out.println(edgeList);
		sc.close();
	}

}
