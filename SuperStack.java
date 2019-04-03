package com.collection1.Vector;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class SuperStack  {
	
	 int stackElement;
	 int stack[];

	 public void noElemtsinStack(int n){
		 stack = new int[n];
	 }
	 
	SuperStack(){
		stackElement--;
	}
	
	public  void push(int element){
		try {
			stack[(++stackElement)] = element;
			System.out.println("Push "+stack[stackElement]);
			System.out.println("Push"+Arrays.toString(stack));
		} catch (NullPointerException e) {
			System.out.println("PLEASE INITILIZE THE SIZE OF THE STACK BY SLECTING 0 and EXECUTE AGAIN !!!!!!!!");
			e.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException exc){
			System.out.println("PLESE ENTER NO OF ELEMENTS LESS THAN LEGHTH OF STACK ");
			exc.printStackTrace();
		}
	}
	
	public  void pop(){
		
		if(stackElement > 0){
			System.out.println("Pop "+ stack[stackElement]);
			stack[stackElement--] = 0;
		}else{
			stack[stackElement] = 0;
			stackElement--;
			System.out.println("Empty");
			
		}
	}
	
	public  void increKeyWithNBotElmnts(int k, int bottomElements){
		for (int i = 0; i < stack.length; i++) {
			if(i >= (stack.length - bottomElements)){
				stack[i] = stack[i] + k;	
			}
			System.out.println("Push"+Arrays.toString(stack));
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		int selectChoice;
		Scanner myObj = new Scanner(System.in);
		SuperStack s = new SuperStack();
		
		
		while(true){
		System.out.println("Welcome to Super Stack operation ");
		System.out.println("Select 0 the No of elementsin stack");
		System.out.println("Select 1 for push");
		System.out.println("Select 2 for pop");
		System.out.println("Select 3 for incrementing with k for N bottom Elements");
		System.out.println("Select 4 for exit");
		selectChoice = myObj.nextInt();
		
		
		switch (selectChoice) {
		case 0:
			try {
				System.out.println("Please Enter the Size of the stack");
				int n = myObj.nextInt();
				s.noElemtsinStack(n);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			break;
		case 1:
			System.out.println("Enter element and push in to stack");
			s.push(myObj.nextInt());
			break;
		case 2:
			try {
			s.pop();
			}
			catch (Exception e) {
				System.out.println("***Please Enter the Size of the stack and continue***");
			}
			break;
		case 3:
			try {
			System.out.println("Enter the value of k to get added to each bottom elements");
			int k = myObj.nextInt();
			System.out.println("Please provide the number of bottom elements of the stack.");
			int e = myObj.nextInt();
			s.increKeyWithNBotElmnts(k, e);
			}
			catch (Exception e) {
				System.out.println("***Please Enter the Size of the stack add elements and continue***");
			}
			break;
		default:
			System.out.println("**Please provide a valid input and continue**");
			break;
		}
		
		}
		
	}
}
