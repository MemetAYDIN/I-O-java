package com.aydin.io;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class WriterTest3 {
	
	public static void main(String[] args){
		
		
		String path="/home/nemo/Desktop/Works/Java/Godoro/ouput.txt";
		try(BufferedWriter bw=new BufferedWriter(new FileWriter(path))) {
			
			bw.write("JSF"+"\r\n");
			bw.write("JPA"+"\r\n");
			bw.flush();
			bw.write("JAX-RS"+"\r\n");
			bw.write("CDI"+"\r\n");
			bw.close();
			
		} catch (Exception e) {
			
			System.out.println("Yazma Yanlışı....");
			e.printStackTrace();
			
		}
		
		

		
	}

}
