package co.id.softwareseni.hourstest.challanges;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ChallangesApplicationTests {

	@Test
	public void countCharTest() {
		countChar("aaabbbccddddeeeef");
	}

	private void countChar(String str) {

		int count[] = new int[256];

		int len = str.length();

		for (int i = 0; i < len; i++) {
			count[str.charAt(i)]++;
		}

		char ch[] = new char[str.length()];
		for (int i = 0; i < len; i++) {
			ch[i] = str.charAt(i);
			int find = 0;
			for (int j = 0; j <= i; j++) {

				if (str.charAt(i) == ch[j]) {
					find++;
				}
			}

			if (find == 1) {
				System.out.print(str.charAt(i) + "" + count[str.charAt(i)]);
			}
		}

	}

}
