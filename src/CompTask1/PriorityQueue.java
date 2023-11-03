package CompTask1;
import java.util.ArrayList;

public class PriorityQueue {

	// Declare an ArrayList to store the elements of the priority queue
	private ArrayList<String> queue; 
	
	// Constructor to initialize the ArrayList
	public PriorityQueue() { 
		/**
		 * when using a queue the list maintains its order and elements are added to the end of the list 
		 * when the ArrayList spots are exceeded its size is increased by 50%
		 * queue also works on FIFO (first in first out)
		 * queue can either queue items at the back or dequeue items at the front 
		 */
		queue = new ArrayList<String>(); 
	}
	
	// Method to add an element to the priority queue
	public void offer(String element) { 
		// If the queue is empty, add the element to the beginning using add method
		if (queue.isEmpty()) { 
			queue.add(element); 
		} else {
		// Else, find the correct position to add the element starting at the front (index 0)
    	int index = 0; 
    	// Iterate through each element in the queue using enhanced for loop
    	for (String str : queue) { 
    		// Compare the priority of the new element to the current element
    		if (element.compareTo(str) > 0) { 
    			// If the new element has higher priority, increment the index to add it after the current element
    			index++; 
    		// If the new element has a lower or equal priority, break the loop and add it before the current element
    		} else { 
    			break;
    		}
    	}
    	// Add the element to the correct position in the queue using the queue add method at the end of the queue if there is space
    	queue.add(index, element); 
		}
	}
	
	// Method to remove and return the highest-priority element in the queue
	public String remove() { 
		// If the queue is not empty
		if (!queue.isEmpty()) { 
			// Get the first (highest-priority) element in the queue using get method
			String element = queue.get(0); 
			// Remove the first element from the queue using remove method
			queue.remove(0); 
			// Return the removed element
			return element; 
		} else { 
			// If the queue is empty, return null
			return null;
		}
	}
	
	// Method to sort the elements of the queue in descending order of priority using the sort method
	public void sort() { 
		// Iterate through each element in the queue
		for (int i = 0; i < queue.size() - 1; i++) { 
			// Iterate through each element after the current element
			for (int j = i + 1; j < queue.size(); j++) { 
				// Compare the priority of the current element to the next element
				if (queue.get(i).compareTo(queue.get(j)) < 0) { 
					// If the next element has higher priority, swap their positions
					String temp = queue.get(i); 
					queue.set(i, queue.get(j));
					queue.set(j, temp);
				}
			}
		}
	}
	
	// Method to return the size of the queue using the size method
	public int size() { 
		//check how many items are currently in the queue (if its empty 0 is returned) 
		return queue.size();
	}
	
	// Main method to test the priority queue
	public static void main(String[] args) { 
		// Create a new instance of the priority queue
		PriorityQueue PriorQueue = new PriorityQueue(); 
		// Create an ArrayList of strings to input into the priority queue
		ArrayList<String> inputList = new ArrayList<String>(); 
		//add these items to the input list
		inputList.add("apple");
		inputList.add("banana");
		inputList.add("carrot");
		inputList.add("date");
		
		// Add each string in the input list to the priority queue
		for (String str : inputList) { 
			PriorQueue.offer(str);
		}

		System.out.println("Priority Queue Contents:");
		// Print and remove each element in the priority queue until it is empty
		while (PriorQueue.size() > 0) { 
			System.out.println(PriorQueue.remove());
		}
  }
}
