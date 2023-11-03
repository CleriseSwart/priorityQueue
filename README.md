# Custom Priority Queue Implementation in Java

## Description
This project contains a custom implementation of a priority queue in Java without using the built-in PriorityQueue class or ArrayList methods. It provides methods to offer elements with a defined priority, remove the highest-priority element, sort elements based on priority, and determine the queue's size.

## Functionalities
- **Offer:** Adds an element with its priority to the queue.
- **Remove:** Removes and returns the highest-priority element.
- **Sort:** Arranges elements in descending order of priority.
- **Size:** Retrieves the current size of the priority queue.

## Implementation Overview
The PriorityQueue.java file contains a class 'PriorityQueue' that employs an ArrayList to simulate a priority queue. It includes the following methods:
- `offer(String element)`: Adds elements in the correct priority order.
- `remove()`: Removes and returns the highest-priority element.
- `sort()`: Sorts elements based on their priority.
- `size()`: Returns the current size of the queue.

## Testing the Priority Queue
The `main` method within the PriorityQueue class serves as a test scenario. It demonstrates the use of the custom priority queue by creating an instance, offering elements from an ArrayList, and displaying the elements after they've been removed based on their priority.

## Note
This project was developed as part of an educational exercise to understand and implement the fundamental concepts of a priority queue without relying on built-in Java structures.

## How to Run
Compile and run the 'PriorityQueue.java' file to test the priority queue functionalities.

## License
This project is released under the MIT License.
