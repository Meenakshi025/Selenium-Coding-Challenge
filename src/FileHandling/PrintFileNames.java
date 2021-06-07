package FileHandling;

import java.io.File;
import java.util.Arrays;

//Print all folders and files from the directory in sorted format
public class PrintFileNames {

	public static void main(String[] args) {
		String path = "C:\\Users\\ADMIN\\Downloads";

		File file = new File(path);
		File downloadDir[] = file.listFiles();

		Arrays.sort(downloadDir);

		for (File e : downloadDir) {
			if (e.isFile()) {
				System.out.println("File : " + e.getName()+" : "+e.getAbsolutePath());
			} else if (e.isDirectory()) {
				System.out.println("Directory : " + e.getName()+" : "+e.getAbsolutePath());
			} else {
				System.out.println("Not known : " + e.getName()+" : "+e.getAbsolutePath());
			}

		}
	}

}
