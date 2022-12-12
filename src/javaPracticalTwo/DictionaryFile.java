package javaPracticalTwo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DictionaryFile {

	public static void main(String[] args) {

		String path = System.getProperty("user.dir") + "\\src\\javaPracticalTwo\\dictionary.txt";
		File f = null; 
		FileReader fr = null; 
		BufferedReader br = null; 

		HashMap<String, List<String>> dict = new HashMap<String, List<String>>();
		try {
			f = new File(path);
			if (f.exists()) {
				System.out.println("File exists!");
				fr = new FileReader(f);
				br = new BufferedReader(fr);
				String line = br.readLine();
				while (line != null) {

				String key = (line.split("-"))[0]; 
				String[] val = (line.split("-")[1]).split(",");
				
				List<String> meanings = new ArrayList<String>();
				
					for (int i = 0; i < val.length; i++) {
						meanings.add(0, val[i]);
					}
					dict.put(key, meanings);
					line = br.readLine();
				}
			// Looping map
				System.out.println("Printing in the required format:");
				for (Map.Entry<String, List<String>> m : dict.entrySet()) {
					System.out.println(m.getKey());
					for (int i = 0; i < m.getValue().size(); i++) {
						System.out.println(m.getValue().get(i));
					}
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}

		}

	}

}
