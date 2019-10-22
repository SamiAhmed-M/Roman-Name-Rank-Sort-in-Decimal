package roman;

import java.io.*;
import java.util.*;

public class ArraySortRankRomanToDecimal {
     /* Accept list of names with rank in Roman numbers and display 
      * the list of numbers sorted with rank in decimal number 
      * Sample data: SAMI XIV,RAMI MDX,Aman MDX,Sara MDLXVI
        Sort test: Aman MDX,RAMI MDX,SAMI XIV,Sara MDLXVI,
        Final output: Aman 1510,RAMI 1510,SAMI 16,Sara 1566,*/
	
	public static void display(String [] arr)
	{
		String [] x = arr;
		for (int i=0; i<x.length; i++)
		{
		// split every array element into the name and the rank (2 elements)
		String []s = x[i].split(" ");	
		
		// change the rank in roman number into array of characters
		char [] roman = s[1].toCharArray();
		int sum = 0, value =0;
			for (int j=0; j<roman.length;j++)
			{
				char ch = roman[j];
					switch(ch) {
						case 'I':
								value = 1;
								break;
						case 'V':
								value = 5;
								break;
						case 'X':
						case 'x': 
								value = 10;
								break;
						case 'L':
								value = 50;
								break;
						case 'C':
								value = 100;
								break;
						case 'D':
								value = 500;
								break;
						case 'M':
								value = 1000;
								break;
			 
						}	// END OF SWITCH		
			sum = sum + value;
			}// Roman number calculator for loop
			System.out.print(s[0] + " " + sum + ",");
		}
		
	}
     public static void main(String[] args) {
    	 // Accept large set of strings
    	InputStreamReader myObj;
		BufferedReader br;
		try {
			myObj = new InputStreamReader(System.in);
			br = new BufferedReader(myObj);
			System.out.println("Please enter list of names with rank in Roman number separated by comma");
			//myObj.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
			String [] str = br.readLine().split(",");
			// sort the array in Ascending order
			Arrays.sort(str);
			// check array
			for (int i=0; i<str.length; i++)
			{
				System.out.print(str[i] + ",");
			}
			//NEW LINE
			System.out.println();
			display(str);
			br.close(); 
	        myObj.close();
		} catch (IOException e) {
			System.out.println(e);
		}
		
    }
}
