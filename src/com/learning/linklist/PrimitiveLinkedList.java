package com.learning.linklist;
class PrimitiveLinkedList {
	Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public void addFromLast(int val) {
		if (head == null) {
			head = new Node(val);
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = new Node(val);
		}
	}

	public void addFromFirst(int val) {
		if (head == null) {
			head = new Node(val);
		} else {
			Node temp = new Node(val);
			temp.next = head;
			head = temp;
		}
	}

	public String findElement(int val) {
		Node n = head;
		while (n != null) {
			if (n.data == val)
				return "Element Found";
			n = n.next;
		}
		return "Not Found";
	}

	public void deleteNode() {
		Node temp;
		if (head == null) {
			System.out.println("List is already empty");
		} else {
			Node curr = head;
			Node prv = null;
			while (curr.next != null) {
				prv = curr;
				curr = curr.next;
			}
			prv.next = null;
		}
	}

	public void deleteFirstNode() {
		if (head == null) {
			System.out.println("List is already empty");
		} else {
			Node curr = head;
			head = curr.next;
		}
	}

	public void printList() {
		Node n = head;
		while (n != null) {
			System.out.println(n.data + " ");
			n = n.next;
		}
	}

	public static void main(String[] args) {
		PrimitiveLinkedList llist = new PrimitiveLinkedList();

		llist.addFromLast(1);
		llist.addFromLast(7);
		llist.addFromLast(3);
		llist.addFromFirst(-2);
		llist.addFromFirst(-9);

		llist.printList();
		System.out.println("-----------------------------------");
		System.out.println("3 " + llist.findElement(3));
		System.out.println("420 " + llist.findElement(420));
		llist.deleteNode();
		System.out.println("-----------------------------------");
		llist.printList();
		llist.deleteFirstNode();
		System.out.println("-----------------------------------");
		llist.printList();
	}
}