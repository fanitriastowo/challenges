package co.id.softwareseni.hourstest.challanges;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FrogsSolution {

	@Test
	public void solution() {

		assertEquals("true", frogs(1, 3, 1, 2));
	}

	private String frogs(int x1, int v1, int x2, int v2) {

		Boolean isItInSameLocation = false;
		int[] frogA = new int[20];
		int[] frogB = new int[20];

		for (int i = x1; i < frogA.length; i = i + v1) {
			frogA[i] = i;
			System.out.print(frogA[i] + ", ");
		}

		System.out.println();

		for (int j = x2; j < frogB.length; j = j + v2) {
			frogB[j] = j;
			System.out.print(frogB[j] + ", ");
		}

		System.out.println();
		System.out.println("=================================");
		for (int i = 0; i < frogA.length; i++) {
			for (int j = 0; j < frogB.length; j++) {

				if (i == j && frogA[i] == frogB[j] && frogA[i] != 0 && frogB[j] != 0) {
					System.out.print(frogA[i] + ", ");
					System.out.print(frogB[j] + ", ");
					
					if (isItInSameLocation == false) isItInSameLocation = true;
				}

			}
		}
		System.out.println();
		System.out.println("=================================");

		return isItInSameLocation.toString();
	}
}
