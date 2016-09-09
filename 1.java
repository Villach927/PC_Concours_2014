import java.io.*;
import java.util.*;

class Question1 {
	public void calc(){
		Scanner sc = new Scanner(System.in);
		int x = 0;
		x = sc.nextInt();
		x *= sc.nextInt();
		System.out.println(x);
	}
	
	public static void main(String[] args){
		Question1 h = new Question1();
		h.calc();
	}
}