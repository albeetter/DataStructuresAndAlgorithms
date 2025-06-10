package dsaActivity;
import java.util.*;

	public class DSALab4 {
		public static void main(String[] args)
		{
			Scanner scan=new Scanner(System.in);

			System.out.print("Enter infix: ");
			String input=scan.nextLine();
			int choice;
			boolean cond=true;

			String newFormat="";

			do
			{
				System.out.println("\nMENU");
				System.out.println("1.Prefix Notation");
				System.out.println("2.Postfix Notation");
				System.out.println("3.Exit");

				System.out.print("Enter choice: ");
				choice=scan.nextInt();

				switch (choice)
				{
				//PREFIX NOTATION
				case 1:
					newFormat = formatPrefix(input);

					System.out.println("Prefix Notation: " + newFormat);
					break;
					//POSTFIX NOTATION
				case 2:
					newFormat = formatPostfix(input);
					System.out.println("Postfix Notation: " + newFormat);
					break;
					//EXIT
				case 3:
					System.out.println("Peja Lattrell Escares\nPROGRAM TERMINATED!!");
					cond=false;
					break;

				}//switch statement curl
			}
			while(cond);//loop condition

		}

		public static String formatPrefix(String infix)
		{
			StringBuilder prefix=new StringBuilder();
			Stack<Character> inputInfix=new Stack<Character>();

			for(int i=infix.length()-1; i>=0;i--)
			{
				char c = infix.charAt(i);
				if(Character.isLetterOrDigit(c)) {
					prefix.insert(0, c);
				}
				else if(c == ')') {
					inputInfix.push(c);

				}
				else if(c == '(') {
					while (!inputInfix.isEmpty() && inputInfix.peek() != ')') {
						prefix.insert(0, inputInfix.pop());
					}
					inputInfix.pop();
				}
				else {
					while(!inputInfix.isEmpty() && bomboclat(inputInfix.peek())>bomboclat(c)) {
						prefix.insert(0, inputInfix.pop());
					}
					inputInfix.push(c);
				}
			}
			while(!inputInfix.isEmpty()) {
				prefix.insert(0, inputInfix.pop());
			}
			return prefix.toString();
		}//formatPrefix curl

		public static String formatPostfix(String infix) {
			StringBuilder postfix = new StringBuilder();
			Stack<Character> inputInfix = new Stack<>();
			for (char c : infix.toCharArray()) {
				if (Character.isLetterOrDigit(c)) {
					postfix.append(c);
				} else if (c == '(') {
					inputInfix.push(c);
				} else if (c == ')') {
					while (!inputInfix.isEmpty() && inputInfix.peek() != '(') {
						postfix.append(inputInfix.pop());
					}

					inputInfix.pop(); // Discard '('
				} else {
					while (!inputInfix.isEmpty() && bomboclat(inputInfix.peek()) >= bomboclat(c)) {
						postfix.append(inputInfix.pop());
					}
					inputInfix.push(c);
				}
			}
			while (!inputInfix.isEmpty()) {
				postfix.append(inputInfix.pop());
			}
			return postfix.toString();
		}

		public static int bomboclat(char c) {
			if (c == '+' || c == '-') {
				return 1;
			} else if (c == '*' || c == '/') {
				return 2;
			} else {
				return 0;
			}
		}
	}
