package com.zikri.sample;

import java.io.*;
public class CopyFile {

   public static void main(String args[])  {  
      FileInputStream in = null;
      FileOutputStream out = null;

      try {
         //in = new FileInputStream(".\\input.txt");
         
         in = new FileInputStream("C:\\STUDENT\\Programs\\input.txt");
       
         out = new FileOutputStream("C:\\STUDENT\\Programs\\output.txt");
         
         int c;
         System.out.println("Input file loaded");
         while ((c = in.read()) != -1) {
            out.write(c);
         }
      } catch (IOException ex)
      {
    	  ex.printStackTrace();
      }
      finally {
         if (in != null) {
            in.close();
         }
         if (out != null) {
            out.close();
         }
      } 
   }
   	System.out.println("Output file loaded");
}