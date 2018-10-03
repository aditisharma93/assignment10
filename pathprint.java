import java.io.*;
public class pathprint {
    public static void main(String ars[]) {
        File f=new File("C:/Users/Aditi Sharma/Documents/Java/Assignment10/abc.txt");
		try{
			FileInputStream fin=new FileInputStream(f);
			int i;
			i=fin.read();
			while(i!=-1)
			{
				System.out.println((char)i);
				i=fin.read();
			}
			fin.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		System.out.println("\nFile path = "+f.getPath());
    }
}