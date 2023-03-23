import java.util.*;
public class num_binario {
	public static void main(String[]args) {
		Stack<Integer> pila= new Stack<Integer>();
		int n=255;
		while(n>0) {
			int r=n%2;
			pila.push(r);
			n=n/2;
		}
		while(pila.isEmpty()==false) {
			System.out.print(pila.pop());
		}
	}
}