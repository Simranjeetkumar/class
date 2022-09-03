
public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 100;i<=200;i++) {//first loop for taking value 
			int itra_no = 0;// variable used for counting the iterations in which value of i%j not 0.
			for(int j = 2;j<=20;j++) {//2nd loop for multiplying i value with 2 to 20;
				if(i!= j) {// condition for checking that given i value not same to j;
					if(i%j !=0) {// condition for checking that i%j not 0;if not 0 than enter in ifbody
						itra_no = itra_no +1;
					}
				}
			}
			if(i>20 && itra_no == 19) {//condition for checking i outside j range 
				//than also if i outside j range than it requires itra_no value 19 for prime no.
				//because greater than j range it requires to providing no of times not 0 is 19
				System.out.println(i);
			}
			else if(i<20 && itra_no ==18 ) {// condition if i less than j range
				//than it requires itra_no no18
				// because if i less than j range than its division with itself is not counted.
				System.out.println(i);
			}
		}
		

	}

}
