import java.io.*;
import java.util.*;

class Question2 {
	public void calc(){
		Scanner sc = new Scanner(System.in);
		int c1, c5, c10, c50, c100, c500, x;
		c1 = sc.nextInt();
		c5 = sc.nextInt();
		c10 = sc.nextInt();
		c50 = sc.nextInt();
		c100 = sc.nextInt();
		c500 = sc.nextInt();
		x = c1 + c5 * 5 + c10 * 10 + c50 * 50 + c100 * 100 + c500 * 500;
		System.out.println(x >= 1000 ? 1 : 0);
	}
	
	public static void main(String[] args){
		Question2 h = new Question2();
		h.calc();
	}
}