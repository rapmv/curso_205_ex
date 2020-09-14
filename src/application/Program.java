package application;

import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
		
		List<String> myStrs = Arrays.asList("Maria", "Alex", "Bob");
		printList(myStrs);
	}

	//o ? e o coringa
	public static void printList(List<?> list) {
		
		//n�o consegue add pois n�o sabe se a adi��o e compativel com o tipo da lista
		//list.add(3);
		
		for (Object obj : list) {
			System.out.println(obj);
		}
	}

}
