package com.aydin.io;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class WriterTest2 {
	
	public static void main(String[] args){
		
		try {
			String path="/home/nemo/Desktop/Works/Java/Godoro/ouput.txt";
			FileWriter fw=new FileWriter(path);
			BufferedWriter bw=new BufferedWriter(fw);
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
