import java.io.*;
import java.util.*;

class Question3 {
	public void calc(){
		Scanner sc = new Scanner(System.in);
		int i,x,y,n = sc.nextInt();
		for(i=0;i<n;i++){
			x = sc.nextInt();
			y = sc.nextInt();
			if(x <= y){
				System.out.println(x);
			}else{
				System.out.println(x % y == 0 ? y : x % y);
			}
		}
	}
	
	public static void main(String[] args){
		Question3 h = new Question3();
		h.calc();
	}
}