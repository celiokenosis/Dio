package Dio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

import javax.swing.JOptionPane;

public class CheckedException {

	public static void main(String[] args) {
		
		String nomeDoArquivo = "c:\\temp\\arquivo.txt";
		try {
			imprimirArquivonoConsole(nomeDoArquivo);
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null,"Revise o nome do arquivo que deseja imprimir: " + e.getCause());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null,"Ocorreu um erro inesperado: " + e.getCause());
		} finally {
			System.out.println("Chegou no Finally..e continua");
		}
		
		System.out.println("Chegou no Finally...");
	}

	private static void imprimirArquivonoConsole(String nomeDoArquivo) throws IOException{

		File file = new File(nomeDoArquivo);
		BufferedReader br = new BufferedReader(new FileReader(file.getName()));
		String line = br.readLine();
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		do {
			bw.write(line);
			bw.newLine();
			line = br.readLine();
		}while(line !=null);
		
			bw.flush();
			br.close();	
		}
	}
