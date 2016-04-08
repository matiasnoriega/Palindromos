package ar.edu.uno.poo2.modulo;
import java.io.*;


public class Test {

	public static void main(String[] args){
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;
		String linea = null;
		try {
			// Apertura del fichero y creacion de BufferedReader para poder
			// hacer una lectura comoda (disponer del metodo readLine()).
			archivo = new File ("/home/matias/workspace/Palindromos/src/ar/edu/uno/poo2/modulo/palin.in");
			fr = new FileReader (archivo);
			br = new BufferedReader(fr);

			// Lectura del fichero

			linea=br.readLine();
		}
		catch(Exception e){
			e.printStackTrace();
		}finally{
			try{                    
				if( null != fr )
					fr.close();     

			}catch (Exception e2){ 
				e2.printStackTrace();
			}
		}
		
		Palindromo palindromo = new Palindromo();
		
		palindromo.cortePalabra(linea);
		
		FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter("/home/matias/workspace/Palindromos/src/ar/edu/uno/poo2/modulo/palin.out");
            pw = new PrintWriter(fichero);
            pw.println(palindromo.toString());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
		
	}

}
