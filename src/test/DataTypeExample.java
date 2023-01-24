package test;

public class DataTypeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		int num1 = 30;
		int num2 = 20;
		
		int sum = num1 + num2;
		int mul = num1 * num2;
		float div = num1/num2;
		
		System.out.println(sum);
		System.out.println(mul);
		System.out.println(div);
		
		String str1 = "Clean World Green World";
		
		System.out.println(str1);
		System.out.println(str1.length());
		
		char ch1 = str1.charAt(0);
		
		System.out.println(ch1);
		
		char chn = str1.charAt(str1.length() -1);
		System.out.println("The last char is " + chn);


		System.out.println("The string in upper case is " + str1.toUpperCase());
		System.out.println("The string in lower case is " + str1.toLowerCase());



	}

}
