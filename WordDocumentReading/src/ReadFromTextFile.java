
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;

public class ReadFromTextFile {
	public static void main(String[] args) throws FileNotFoundException {
		
		File file=new File("C:\\Users\\utkar\\OneDrive\\Documents\\AlfidoWork.txt");
		Scanner sc=new Scanner(file);
		while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
		}

		Scanner scan = new Scanner(file);
		int count=0;
		while(scan.hasNext())
		{
			String wordStr=scan.next();
			count++;
		}
		System.out.println();
		System.out.println("The Total number of words in the Text Document is " + count);
		
		System.out.println();
		System.out.println("The File location within the system : ");
		System.out.println(file.getAbsolutePath());
		
		FileReader wordRead= new FileReader(file);
		BufferedReader reader = new BufferedReader(wordRead);
		double avgWord=0;
		double chara=0;
		String str;
		
		
	}
}