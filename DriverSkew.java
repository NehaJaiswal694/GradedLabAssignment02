
import java.util.*;
public class DriverSkew{

	public static void main(String[] args) {

		Skew transactionsTree = new Skew();


		transactionsTree.node = new Node(50);
		transactionsTree.node.left = new Node(30);
		transactionsTree.node.right = new Node(60);
		transactionsTree.node.left.left = new Node(10);
		transactionsTree.node.right.left = new Node(40);


		convertBstToRightSkewedTree(transactionsTree.node);
		System.out.println("The Transactions in ascending Order are : ");
		traverseRightSkewedTree(headNode);
	}

}