package grid;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Setup_DockerGrid {
	
	@BeforeTest
	void startDockerGrid() throws IOException, InterruptedException {
		Runtime.getRuntime().exec("cmd /c start start_DockerGrid.bat");
		Thread.sleep(15000);
	}

	@AfterTest
	void stopDockerGrid() throws IOException, InterruptedException {
		Runtime.getRuntime().exec("cmd /c start stop_DockerGrid.bat");
		Thread.sleep(15000);
		
		Runtime.getRuntime().exec("taskkill /f /im cmd.exe");//closes command promts
	}

}
