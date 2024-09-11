package p2;
import java.util.Scanner;
import p1.*;

public class DemoBank {

	

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int count=0;
		
		pqr:while(true)
			
		{
			System.out.println("Enter the pin nmber");
			int pinNo = s.nextInt();
			
			if(pinNo>=1000 && pinNo<=9999)
			{
				
				if(pinNo==1111 || pinNo==2222 || pinNo == 3333)
				{
					
					System.out.println("********** vEnter your choice **********");
					
					
					System.out.println("\t1.WithDraw" + "\t2 Deposit");
					System.out.println("Enter your choice");
					int choice = s.nextInt();
				    
					switch(choice)
					{
					
					case 1:
						System.out.println("Enter amount the withDraw ");
						int a1 = s.nextInt();
						
						if(a1>=0 )
						{
							
							if(a1<=2000)
							{
								WithDraw wd = new WithDraw();
								wd.wDraw(a1);
							}
							else
							{
								System.out.println("Insuffcent Blance");
							}
						}
						
						else
						{
							System.out.println("Invailid amount");
						}
						break pqr;
						
					case 2:
						
						System.out.println("Enter amount Depocit");
						int a2 = s.nextInt();
						
						if(a2>0 && a2 >= 1000)
						{
							Depocit dp = new Depocit();
							dp.depocit(a2);
						}
						else
						{
							System.out.println("Invalid amount");
						}
						break pqr;
					default:
						System.out.println("Invalid choice");
						break pqr;
				    }
					
				}
				else
				{
					System.out.println("Pin Number do not exist");
				}
				
			}
			else
			{
				System.out.println("Invailid pin Number");
				count ++;
			}
		}

	}

}
