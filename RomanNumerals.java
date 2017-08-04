import java.util.Scanner;

public class RomanNumerals {

	// TODO
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter a number: ");
		String n = keyboard.next();
		System.out.println();

		int n1=0;
		while (true) {

			try {
        	n1 = Integer.parseInt(n);
			break;
    		} 	catch (NumberFormatException ignore) {
        		System.out.println("Not a number.");
				return;
				}
		}

		if (n1 < 1 || n1 > 4999) {
			System.out.println("Not a valid number.");
			return;
		}

		char a = '0';
		char b = '0';
		char c = '0';
		char d = '0';

		if (n.length() == 4) {

		a = n.charAt(0);
		b = n.charAt(1);
		c = n.charAt(2);
		d = n.charAt(3);

		} else if (n.length() ==3 ) {
		a = n.charAt(0);
		b = n.charAt(1);
		c = n.charAt(2);

		} else if (n.length() ==2)  {
		a = n.charAt(0);
		b = n.charAt(1);

		} else {
		a = n.charAt(0);
		}

		int A = a - '0';
		int B = b - '0';
		int C = c - '0';
		int D = d - '0';
		//To avoid confusion the int nocX is counting the amount of symbols when the digit is between 6 and 9//
		//Case of 4 digit number//

		if (n.length() == 4) {
	    	System.out.print("Roman equivalent is ");

			for( A = (int)A ; A>0 ; A -=1) {
				System.out.print("M");
			}
			if(B == 9 ) {
				System.out.print("CM");
			}
			if(B >= 5 && B < 9) {
				int nocB = B-5;
				System.out.print("D");
				for (nocB = (int)nocB; nocB>0 ; nocB -=1) {
				System.out.print("C");
				}
			}
			if (B == 4) {
				System.out.print("CD");
			}
			if (B < 4 && B != 0) {
				for(B = (int)B; B>0; B-=1) {
				System.out.print("C");
				}
			}
			if ( C == 9) {
			System.out.print("XC");
			}
			if (C >= 5 && C < 9) {
				int nocC = C-5;
				System.out.print("L");
				for (nocC = (int)nocC ; nocC>0 ; nocC -=1) {
				System.out.print("X");
				}
			}
			if (C == 4) {
				System.out.print("XL");
			}
			if (C < 4 && C != 0) {
				for (C = (int)C ; C > 0; C -=1){
				System.out.print("X");
				}
			}
			if (D == 9) {
				System.out.print("IX");
			}
			if (D >=5 && D < 9) {
				int nocD = D-5;
				System.out.print("V");
				for (nocD = (int)nocD ; nocD >0 ; nocD -=1) {
					System.out.print("I");
				}
			}
			if (D == 4) {
				System.out.print("IV");
			}
			if (D < 4 && D != 0) {
				System.out.print("I");
			}
      if(D == 0 || D == 0 && C == 0 || D ==0 && C ==0 && B == 0) {
        System.out.println("");
      }
		}

		//Case of three digit number//

		if (n.length() == 3) {
	    	System.out.print("Roman equivalent is ");

			if(A == 9 ) {
				System.out.print("CM");
			}
			if(A >= 5 && A < 9) {
				int nocA = A-5;
				System.out.print("D");
				for (nocA = (int)nocA; nocA>0 ; nocA -=1) {
				System.out.print("X");
				}
			}
			if (A == 4) {
				System.out.print("CD");
			}
			if (A < 4 && A != 0) {
				for(A = (int)A; A>0; A-=1) {
				System.out.print("C");
				}
			}

			if(B == 9 ) {
				System.out.print("XC");
			}
			if(B >= 5 && B < 9) {
				int nocB = B-5;
				System.out.print("L");
				for (nocB = (int)nocB; nocB>0 ; nocB -=1) {
				System.out.print("X");
				}
			}
			if (B == 4) {
				System.out.print("XL");
			}
			if (B < 4 && B != 0) {
				for(B = (int)B; B>0; B-=1) {
				System.out.print("X");
				}
			}
			if ( C == 9) {
			System.out.print("IV");
			}
			if (C >= 5 && C < 9) {
				int nocC = C-5;
				System.out.print("V");
				for (nocC = (int)nocC ; nocC>0 ; nocC -=1) {
				System.out.print("I");
				}
			}
			if (C == 4) {
				System.out.print("IV");
			}
			if (C < 4 && C != 0) {
				for (C = (int)C ; C > 0; C -=1){
				System.out.print("I");
				}
			}
      if (C == 0 || B ==0 && C ==0) {
        System.out.println("");
      }
		}
		//Case for two digit numbers//

		if (n.length() == 2) {
	    	System.out.print("Roman equivalent is ");
			if(A == 9 ) {
				System.out.print("XC");
			}
			if(A >= 5 && A < 9) {
				int nocA = A-5;
				System.out.print("L");
				for (nocA = (int)nocA; nocA>0 ; nocA -=1) {
				System.out.print("X");
				}
			}
			if (A == 4) {
				System.out.print("XL");
			}
			if (A < 4 && A != 0) {
				for(A = (int)A; A>0; A-=1) {
				System.out.print("X");
				}
			}
			if(B == 9 ) {
				System.out.print("IX");
			}
			if(B >= 5 && B < 9) {
				int nocB = B-5;
				System.out.print("V");
				for (nocB = (int)nocB; nocB>0 ; nocB -=1) {
				System.out.print("I");
				}
			}
			if (B == 4) {
				System.out.print("IV");
			}
			if (B < 4 && B != 0) {
				for(B = (int)B; B>0; B-=1) {
				System.out.print("I");
				}
			}
      if (B == 0) {
        System.out.println();
      }
		}
		//Case for one digit numbers//
		if (n.length() == 1) {
	    	System.out.print("Roman equivalent is ");
			if(A == 9 ) {
				System.out.print("IX");
			}
			if(A >= 5 && A < 9) {
				int nocA = A-5;
				System.out.print("V");
				for (nocA = (int)nocA; nocA>0 ; nocA -=1) {
				System.out.print("I");
				}
			}
			if (A == 4) {
				System.out.print("IV");
			}
			if (A < 4) {
				for(A = (int)A; A>0; A-=1) {
				System.out.print("I");
				}
			}

		} System.out.println();
}//End of main method//
}//End of class RomanNumerals//
