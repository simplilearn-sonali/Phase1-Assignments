package eg2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class DemoUsingLHSAndPQ

{

	public static void main(String[] args) {
		Set<String> li=new LinkedHashSet<>();
		li.add("hey");
		li.add("hey");
		li.add("heloo");
		li.add(null);
		li.add(null);
		li.add("hey");
		li.add("java");
		li.add("spring");
		li.add("agile");
		li.add("hibernate");
		li.add("jdbc");
		System.out.println("li : "+li);
		
		Set<String> lhs=new LinkedHashSet<>();
		lhs.add("hey");
		lhs.add("hey");
		lhs.add("heloo");
		lhs.add(null);
		lhs.add(null);
		lhs.add("hey");
		lhs.add("java");
		lhs.add("spring");
		lhs.add("agile");
		lhs.add("hibernate");
		lhs.add("jdbc");
		System.out.println("lhs : "+lhs);
		
		
		
		// priority queue
		
		Set<String> pq=new HashSet<>();
		pq.add("hey");
		pq.add("hey");
		pq.add("heloo");
		pq.add(null);
		pq.add(null);
		pq.add("hey");
		pq.add("java");
		pq.add("spring");
		pq.add("agile");
		pq.add("hibernate");
		pq.add("jdbc");
		System.out.println("pq : "+pq);

			
		
		}

	}

 
