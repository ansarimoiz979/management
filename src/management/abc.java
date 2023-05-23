package management;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import com.student.manage.*;


public class abc {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the student management app");
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
		while(true)
		{
			System.out.println("Press 1 to add student");
			System.out.println("Press 2 to delete student");
			System.out.println("Press 3 to display student");
			System.out.println("Press 4 to exit app");
			int c = Integer.parseInt(br.readLine());
			
			if(c == 1)
			{
				System.out.println("Enter your name");
				String name = br.readLine();
				 
				System.out.println("Enter phone");
				String phone = br.readLine();
					 
				System.out.println("Enter age");
				String age = br.readLine();
				
				System.out.println("Enter city");
				String city = br.readLine();
				
				student  st = new student( name , phone , city );
				System.out.println(st);	
			}
			if(c == 2)
			{
				System.out.println("Press 1 to add student");
				
			}
			if(c == 3)
			{
				System.out.println("Press 1 to add student");
				
			}
			if(c == 4)
			{
				break;
				
			}
		}
		System.out.println("Thankyou for using my application, see you soon");


	}

}
