import java.util.*;
import java.io.*;
import java.math.*;

/*
正解のコードではないので注意
*/

public class Helloworld{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int h,h2,a,b,j,i = 0;
		int n;
		List<Integer> list2 = new ArrayList<>();
		List<Integer> list1 = new ArrayList<>();
		
		while((n = sc.nextInt()) != 0){
			
			for(i = 0; i < n; i++) {
				list1.add(sc.nextInt());
				list2.add(0);
			}
	
			j = 0;
			
			while(!list1.equals(list2)){
				a = Collections.max(list1);
				h = list1.indexOf(a);
				b = Math.max(h == 0 ? -1 : list1.get(h-1), h == n - 1 ? -1 : list1.get(h+1));
				
				list1.set(h, -1);
				h2 = list1.indexOf(b);
				list1.set(h, a);
				
				list1.set(h, a == 0 ? 0 : a -1);
				list1.set(h2, b == 0 ? 0 : b -1);
				j += 2;
			}
			System.out.println(j);
		}
	}
}