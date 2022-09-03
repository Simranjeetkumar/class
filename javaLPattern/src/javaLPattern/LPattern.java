package javaLPattern;

public class LPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0;i <= 4;i++) {
			if(i != 4) {//condition for printing first 3 stars in new line with space.
			System.out.println("*"+ " ");}
			else if (i==4) {// condition for printing 5 stars in same line
				for(int j = 0; j<=4;j++) {
					System.out.print("*");
					
				}
			}
		}

	}

}
