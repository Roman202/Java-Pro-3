package exempels;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author romah
 */
public class Exempels {

    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        try {
        File file = new File("newfile.txt");
            if(!file.exists())
                file.createNewFile();
            
            PrintWriter pw = new PrintWriter(file);
            pw.println("Everhing is working");
            pw.println("Hello, world!");
            pw.close();
            
            
            br = new BufferedReader(new FileReader("newfile.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            
        } catch(IOException e) {
            System.out.println("Error: " + e);
        } finally {
            try {
            br.close();
            } catch(IOException e) {
            System.out.println("Error: " + e);
        }
    }
    
}
