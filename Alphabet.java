//Write a program to find ASCII values of a character.
import java.util.*;
class Alphabet{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		char ch;
		System.out.println("Enter character:");
		ch=sc.next().charAt(0);
		int ASCII=ch;
		System.out.println("Ascii value of "+ch+" is "+ASCII);
		
	}
}