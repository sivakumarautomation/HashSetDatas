package collections; //package//

import java.util.*; //important//

public class HashDemo { //class//
	
	public static void main(String[] args) { //main//
		
		HashSet<String>hs = new HashSet<String>();
		
		hs.add("Mango");
		hs.add("Apple");
		hs.add("Grapes");
		hs.add("Pineapple");
		hs.add("Jackfruit");
		hs.add("Mango");
		
		System.out.println(hs);
		System.out.println(hs.contains("Lemon"));
		System.out.println(hs.contains("Apple"));
		
		hs.remove("Mango");
		System.out.println(hs);
		
		//for each loop//
		
		for(String sg :hs) {
			System.out.println(sg);
		}
		
		Set<String> oset = new HashSet<String>();
		
		oset.add("Mango");
		oset.add("Apple");
		oset.add("Grapes");
		oset.add("Pineapple");
		oset.add("Jackfruit");
		oset.add("Mango");
		
		System.out.println(oset);
		
		Set<Integer> firstlist = new HashSet<Integer>();
		firstlist.addAll(Arrays.asList(new Integer[] {1,2,3,4,5,6,7,8}));
		
		Set<Integer> secondlist = new HashSet<Integer>();
		secondlist.addAll(Arrays.asList(new Integer[] {1,2,14,16,13,15,17,18,19}));
		
		//Union//
		Set<Integer>unionSet = new HashSet<Integer>(firstlist);
		unionSet.addAll(secondlist);
		
		System.out.println(unionSet); //Arrange by order--Ascending//---sort out//
		
		//Intersection//
		Set<Integer> interset = new HashSet<Integer>(firstlist);
		interset.retainAll(secondlist);
		
		System.out.println(interset);   //compare for intersection in Math--> Set//
		
		Set<Integer>diffset = new HashSet<Integer>(firstlist);
		diffset.removeAll(secondlist); //Remove//
		
		
	}

}
