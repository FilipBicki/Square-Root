import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		int test = 500;
		root(test);
		
	}
	
	public static float root(int x){
		ArrayList<Integer> X = lister(x);
		int length = X.size();
		ArrayList<Integer> Y;
		if(length % 2 == 0){
			for(int i=0;i<length;i+=2){
				while
			}
		}
		else{

		}
		return x;
	}
	public static ArrayList<Integer> lister(int temp){
		ArrayList<Integer> array = new ArrayList<Integer>();
		do{
		    array.add(temp % 10);
		    temp /= 10;
		} while  (temp > 0);
		Collections.reverse(array);
		return array;
	}
}
