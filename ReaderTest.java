package com.aydin.io;

import java.io.BufferedReader;
import java.io.FileReader;


public class ReaderTest {
	
public static void main(String[] args) throws Exception{
		
		
		String path="/home/nemo/Desktop/Works/Java/Godoro/ouput.txt";
	

		FileReader fr=new FileReader(path);
		BufferedReader br=new BufferedReader(fr);
		
		String line=null;
		String text=" ";
		
		while((line=br.readLine())!=null)
		{
			text+=line+"\r\n";
			
		}
		/*do while da kullanılabilir
		 *do{
		 *line=br.readLine();
		 *text+=line+"\r\n";
		 *}while(line!=null);
		 **/
		 

		System.out.println("Yazı:\n"+text);
		

		
	}

}
