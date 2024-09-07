package todolist;

import java.util.Scanner;
import java.util.ArrayList;

public class todolist {

	public static ArrayList<String> tasks = new ArrayList<>();
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			System.out.println("\nTo-Do List Application");
			System.out.println("1. View Tasks");
			System.out.println("2. Add Task");
			System.out.println("3. Remove Task");
			System.out.println("4. Exit");

			System.out.print("Choose an option: ");
			int choice = scanner.nextInt();
			
			scanner.nextLine();

			switch (choice) {
			case 1:
				viewTasks();
				break;
			case 2:
				addTask();
				break;
			case 3:
				removeTask();
				break;
			case 4:
				System.out.println("Exiting...");
				return;
			default:
				System.out.println("Invalid option! Please choose again.");
			}
		}
	}

	public static void viewTasks() {
		if (tasks.isEmpty()) {
			System.out.println("Your to-do list is empty.");
		} else {
			System.out.println("\nTo-Do List:");
			for (int i = 0; i < tasks.size(); i++) {
				System.out.println((i + 1) + ". " + tasks.get(i));
			}
		}
	}

	public static void addTask() {
		System.out.print("Enter a new task: ");
		String task = scanner.nextLine();
		if (task.isEmpty()) {
	        System.out.println("Task cannot be empty. Please enter a valid task.");
	    } else {
	        tasks.add(task);  
	        System.out.println("Task added successfully!");
	    }
	}

	public static void removeTask() {
		if (tasks.isEmpty()) {
			System.out.println("Your to-do list is empty.");
			return;
		}

		viewTasks();
		System.out.print("Enter the task number to remove: ");
		int taskNumber = scanner.nextInt();
		scanner.nextLine(); // Consume the newline character

		if (taskNumber > 0 && taskNumber <= tasks.size()) {
			tasks.remove(taskNumber - 1);
			System.out.println("Task removed successfully!");
		} else {
			System.out.println("Invalid task number!");
		}

	}

}

