

package flow;
import java.util.*;

// 이예준

public class LeeYeJun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		
		int randa = 0;
		int randb = 0;
		int randc = 0;
		int randd = 0;
		
		for(int a=0; a < 50; a++) {
			int RN = rand.nextInt(10);
			System.out.print(RN+ "  ");
		if(RN % 2 == 0) {
			randa += 1;
		}
		if(RN % 3 == 0) {
			randb += 1;
		}

		if(RN % 5 == 0) {
			randc += 1;
		}
		randd++;
		if(randd % 5 == 0) {
			System.out.println();
		}
		}
		
			System.out.println("2의 배수의 갯수는 :" + randa);
			System.out.println("3의 배수의 갯수는 :" + randb);
			System.out.print("5의 배수의 갯수는 :" + randc);
		
		
		
	}

}
