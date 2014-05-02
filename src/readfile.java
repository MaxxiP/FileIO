//author Miles Döring, Lennart Muchow ---test
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;


public class readfile {

	public static HashMap alph = new HashMap();
	public static HashMap alph_num = new HashMap();	
	public static int[] cnt_alph = new int[200];

		
	public static void main(String[] args) throws IOException{
		FileReader inputStream = null;
        FileWriter outputStream = null;
        
        
        for(int i=97;i<=122;i++){
			alph.put(i, (char)i);
		}

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
            	
            	System.out.print((char)i + "(" + i + ")" + ": ");
            	System.out.println(cnt_alph[i]);
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


/**int c;
while ((c = inputStream.read()) != -1) {
	outputStream.write("Char: [");
	outputStream.write(c);
	outputStream.write("] -- [" + (int)c + "]");
	outputStream.write("\r\n");                
for(int i=97;i<=122;i++){
	outputStream.write("Buchstabe: ");
	outputStream.write((char)alph.get(i));
	outputStream.write("\r\n");
}*/