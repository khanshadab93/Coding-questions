// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

public class StringQues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String input = sc.nextLine();
		String[] inputs = input.split(" ");
		String output="";
		for(String in: inputs){
		 for(int i=in.length()-1;i>=0;i--){
			 output+=in.charAt(i);
		 }
		 output+=" ";
		}

		System.out.println(output);
    }
}