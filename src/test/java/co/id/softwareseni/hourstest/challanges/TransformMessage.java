package co.id.softwareseni.hourstest.challanges;

import java.util.HashMap;
import java.util.LinkedList;

public class TransformMessage {

	public LinkedList transformMessage() {

		LinkedList list = new LinkedList();
		HashMap map = new HashMap();

		System.out.println("Transform Starting...");

		/**
		 This condition should be changed 
		 if (map.get(1 == "type") { 
		  	...... 
		 } else { 
		 		...... 
		 }
		 */

		// to something like this.
		// because object must not compared to primitive data type using ==
		// operation
		// if (map.get("type").equals(1))

		System.out.println("Transform Finished...");

		return list;
	}
}
