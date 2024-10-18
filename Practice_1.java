package com.basic;

import java.util.Scanner;

public class Practice_1 {

	static String res;
	static int maxNum = 0;
	
	public static void powerOfNumber(int a, int b)
	{
		double pow = Math.pow(a, b);
		
		System.out.println("power of a  number "+pow);
		
		double sqrt = Math.sqrt(pow);
		System.out.println("square root of a a number "+sqrt);
	}

	public static void swapTwoNumBitOperator(int a, int b) {
		System.out.println("before_swap two numbers :"+a+" << "+b);
		a^=b;
		b^=a;
		a^=b;
		System.out.println("after_swap two numbers :"+a+" >> "+b);
	}
	
	public static void oddEvenNumberBitOperator(int a)
	{
		res = ((a & 1) != 0 )? "odd" : "even";
		System.out.println(res);
	}
	
	public static void maxBetweenTwoNumber(int a, int b) {
		maxNum = (a > b) ? a : b;
		System.out.println("max between two numbers : "+maxNum);
	}
	
	public static void maxBetweenThreeNumber(int a, int b, int c) {
		maxNum = ( a > b && a > c ) ? a : (b > c) ? b : c;
		System.out.println("max between three numbers : "+maxNum);
	}
	
	public static void oddEven(int a) {
		res = ( a%2 != 0 ) ? "odd number" : "even number";
		System.out.println("is "+res);
	}
	
	public static void leapYearOrNot(int a) {
		res = ( a%4==0 && a%100!=0) ? "leap year" : (a%400==0) ? "leap year" : "not a leap year";
		System.out.println("is "+res);
	}
	
	public static void checkIsAlphabetOrNot(char a) {
		char lc = Character.toLowerCase(a);
		res = (lc >= 97 && lc <= 122) ? "Alphabet" : "not Alphabet";
		System.out.println("is "+res);
	}
	
	public static void checkNumberStatus(int a)
	{
		res = (a > 0) ? "positive" : (a == 0) ? "zero" : "negative";
		System.out.println("is "+res);
	}
	
	public static void isDivisible(int c) {
		res = (c%5==0 && c%11==0) ? "divisible" : "not divisible";
		System.out.println("is "+res);
	}
	
	public static void checkVowelOrConsonant(char x) {
		char temp = Character.toLowerCase(x);
		switch(temp) {
			case 'a' : 
			case 'e' : 
			case 'i' : 
			case 'o' : 
			case 'u' : res = "vowel";
			break;
			default : res = "consonat";
			break;
		}
		System.out.println("is "+res);
	}
	
	public static void checkAlphbetDigitSpl(char x) {
		res = (x >= 65 && x <= 90 || x >= 97 && x <= 122) ? "Alphabet" : (x >= 48 && x <= 57) ? "Digit" : "Special Character";
		System.out.println("is "+res);
	}
	
	public static void upperOrLowerCaseAlphabet(char x) {
		res = (x >= 65 && x <= 90) ? "Upper" : (x >= 97 && x <= 122) ? "Lower" : "invalid input !";
		System.out.println("is "+res);
	}
	
	public static void printWeekDays(int a) {
		switch(a) {
			case 0 : res = "Sunday";
			break;
			case 1 : res = "Monday";
			break;
			case 2 : res = "Tuesday";
			break;
			case 3 : res = "Wednesday";
			break;
			case 4 : res = "Thursday";
			break;
			case 5 : res = "Friday";
			break;
			case 6 : res = "Saturday";
			break;
			default : res = "invalid input!";
			break;
		}
		System.out.println("is "+res);
	}
	
	public static void countNotes(int amount) {
		
		int lastBalance = 0, note50 = 0, note100 = 0, note200 = 0, note500 = 0;
		int temp = amount;
		while(temp!=0) {
			if(temp >= 500){
				note500 = temp/500;
				temp%=500;
			}
			else if(temp >= 200) {
				note200 = temp/200;
				temp%=200;
			}
			else if(temp >= 100) {
				note100 = temp/100;
				temp%=100;
			}
			else if(temp >= 50) {
				note50 = temp/50;
				temp%=50;
			}else {
				lastBalance = temp;
				break;
			}
		}
		System.out.println("Actual Balance : "+amount);
		System.out.println("Total number of notes in given amount :");
		System.out.println("500 x "+note500+"\n200 x "+note200+"\n100 x "+note100+"\n50 x "+note50);
		System.out.println("Last Balance : "+lastBalance);
	}
	
	public static void maxBetweenTwoNum(int a, int b) {
		
		int result = a > b?0:1;
		switch(result) {
			case 0 : System.out.println(a+" is max");
			break;
			case 1 : System.out.println(b+" is max");
			break;
		}
	}
	
	public static void simpleCalculator(float a, float b, char x)
	{
		double total = 0;
		switch(x) {
			case '+': total = a+b;
			break;
			case '-': total = a-b;
			break;
			case '*': total = a*b;
			break;
			case '/':  
				if (b == 0) {
		            throw new ArithmeticException("Divider cannot be zero");
		        } else {
		            total = a / b;
		        }
			break;
			case '%': total = a%b;
			break;
			default:System.err.println("invalid input");
			break;
		}
		System.out.println(a+" "+x+" "+b+" = "+total);
	}
	
	public static void printAllAlphabets()
	{
//		for(int i=65;i<=90;i++)
//		{
//			System.out.print((char)i+" ");
//		}
		int i=65;
		while(i<=90) {
			System.out.print((char)i+" ");
			i++;
		}
	}
	
	public static void multiplicationTable(float a)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(a+" x "+i+" = "+(a*i));
		}
	}
	
	public static int countDigits(float a)
	{
		int count = 0;
//		while((int) a>0)
//		{
//			count++;
//			a/=10;
//		}
//		System.out.println(count);
		
		String valueOf = String.valueOf((int)a);
		count = valueOf.length();
		System.out.println(">>>>>>> "+valueOf.length());
		return count;
	}
	
	public static void firstLastDigit(int a)
	{
		int countDigits = countDigits(a);
		int firstDigit =  a/(int) Math.pow(10, --countDigits);
		int lastDigit = a%10;
		System.out.println(firstDigit+" "+lastDigit);
		
		int sum = firstDigit + lastDigit;
		System.out.println("sum of first and last digit of a number : "+sum);
	}
	
	public static void swapFirstAndLastDigitOfNumber(int a)
	{
		int temp = a;
		int countDigits = countDigits(a);
		int firstDigit =  temp/(int) Math.pow(10, --countDigits);
		int lastDigit = temp%10;
		int swapNumber = 0;
		swapNumber = (int)(lastDigit * Math.pow(10, countDigits));
		System.out.println(lastDigit);
		swapNumber += (int)(temp%Math.pow(10, countDigits));
		System.out.println(lastDigit);
		swapNumber = (swapNumber-lastDigit)+firstDigit;
		System.out.println(swapNumber);
	}
	
	public static void sumOfNumber(int b) {
		int sum = 0;
		while(b>0)
		{
			int digit =  b%10;
			sum += digit;
			b/=10;
		}
		System.out.println("sum of a number "+sum);
	}
	
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("Enter A value : ");
//		float a = sc.nextFloat();
//		System.out.println("Enter B value : ");
//		float b = sc.nextFloat();
//		System.out.println("Enter C value : ");
//		float c = sc.nextFloat();
//		System.out.println("Enter Operator : ");
//		char x = sc.next().charAt(0);
		
		int a = 10, b= 7856, c = 55;
		char x = 'e';
//		powerOfNumber(4, 3);
//		swapTwoNumBitOperator(a, b);
//		oddEvenNumberBitOperator(b);
//		maxBetweenTwoNumber(a, b);
//		maxBetweenThreeNumber(a, b, c);
//		oddEven(c);
//		leapYearOrNot(2017);
//		checkIsAlphabetOrNot(x);
//		checkNumberStatus(a);
//		isDivisible(c);
//		checkVowelOrConsonant(x);
//		checkAlphbetDigitSpl(x);	
//		upperOrLowerCaseAlphabet(x);
//		printWeekDays(a);
//		countNotes(2851);
//		maxBetweenTwoNum(a, b);
	
//		simpleCalculator(a, b, x);
//		printAllAlphabets();
//		multiplicationTable(a);
//		countDigits(a);
//		firstLastDigit(b);
//		swapFirstAndLastDigitOfNumber(b);
		sumOfNumber(b);
		
		
	}
}
