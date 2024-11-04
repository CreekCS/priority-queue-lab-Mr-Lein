// import statements
import java.util.*;
import java.io.*;

public class PriorityQueueLab {
  public static void main(String[] args){
    
    PriorityQueue<Integer> pQueue = new PriorityQueue<>();
    String file = "RandIntegers.txt";
    try {
        Scanner scan = new Scanner(new File(file));
        while(scan.hasNextLine()){
            Integer value = Integer.parseInt(scan.nextLine());
            pQueue.add(value);

        }
    } catch (FileNotFoundException e) {
        // Handle the case where the file cannot be found
        System.out.println("File not found: " + file);
    }
    System.out.println("PriorityQueue contents (in natural order):");
        while (!pQueue.isEmpty()) {
            //System.out.println(pQueue.poll()); // Removes and prints the smallest element
            System.out.println(pQueue);
            pQueue.poll();
        }

  }
}

