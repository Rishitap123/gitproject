package gitproject;
import java.io.*;
public class Day_10 {
		  public static void main(String[] args)
		    {
		        String path = "C:\\Users\\Rishita Prakash\\OneDrive\\Desktop\\about";
		        File file = new File(path);
		        int fileCounter=0;
		        int dirCounter=0;

		         String str[]=file.list();
		         for(String s: str){
		            File fls= new File(file,s);
		            if(fls.isFile()){
		                fileCounter++;
		            }
		            if(fls.isDirectory()) {
		            	dirCounter++;
		            }
		            System.out.println(fls);
		         }
		         System.out.println("Total Files: "+fileCounter+" Total Director: "+dirCounter);

		    }

	}

