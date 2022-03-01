package Framework.MavenJava;

import org.testng.annotations.Test;

public class SeleniumTest {

	@Test
	public void InvokeDriver() {
		System.out.println("chromedriver");
		System.out.println("IEDriver");
		System.out.println("Firefox driver");
	}

	@Test
	public void Webpage() {
		System.out.println("Webpage is loaded");
	}

}
