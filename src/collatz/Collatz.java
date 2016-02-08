package collatz;

import java.util.Scanner;
public class Collatz {
	public static void main(String[] args){
		Scanner keybd = new Scanner(System.in);
		System.out.println("Enter any integer: ");
		int n = keybd.nextInt();
		while(n>1){
			if(n%2==0){
				n=n/2;
			}else{
				n=3*n + 1;
			}
			System.out.println(n);
		}
		keybd.close();
	}
}
