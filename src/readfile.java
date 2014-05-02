//author Miles Döring, Lennart Muchow
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;


public class readfile {

	public static HashMap alph_num = new HashMap();	
	public static int[] cnt_alph = new int[200];

		
	public static void main(String[] args) throws IOException{
		FileReader inputStream = null;
        FileWriter outputStream = null;

        try {
            inputStream = new FileReader("src/input.txt");
            outputStream = new FileWriter("src/frequency.txt");
            
            outputStream.write("Häufigkeit der Buchstaben im eingelesenen Text");
            outputStream.write("\r\n");
            
            int c; 
            while((c = inputStream.read()) != -1){
            	//System.out.print(c + "-");
            	cnt_alph[c]++;
            	//System.out.println(cnt_alph[c]);
            	//alph_num.put(c, value);
            	//outputStream.write((int)alph_num.get((char)c));
            }
            
            for(int i=97;i<=122;i++){
            	int x = cnt_alph[i];
            	outputStream.write((char)i + "(" + i + ")" + ": ");
            	outputStream.write("" + (int)x);
            	outputStream.write("\r\n");
            	//System.out.print((char)i + "(" + i + ")" + ": ");
            	//System.out.println(cnt_alph[i]);
            }
            
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }

	}

}