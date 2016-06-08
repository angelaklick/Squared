import java.util.Scanner;

public class Squared {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean flag = true;
		
		while(flag){
		
		int s, c;
		
		System.out.print("Enter an integer: ");
		int n = scan.nextInt();
		
		System.out.println("Number        Squared        Cubed");
		System.out.println("======        =======        ======");
		
		for(int i = 1; i <= n; i++){
			
			s = i * i;
			c = i * i * i;

			System.out.print(i + "\t" + "\t");
			System.out.print(s + "\t" + "\t");
			System.out.print(c + "\t" + "\t");
			System.out.println();
			
			
		}
		
		System.out.println("Would you like to continue? (y/n)");
		String input = scan.next();
		
		if(input.equalsIgnoreCase("n")){
			
			System.out.println("Thanks for coming!");
			flag = false;
			
		}
			
	
		
		}
		
		
	}

}
