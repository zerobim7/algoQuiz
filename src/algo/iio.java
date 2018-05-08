package algo;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.IIOException;
import javax.imageio.ImageIO;

public class iio {
	
	public static void main(String[] args){
		
		BufferedImage image = null;
		String imagePath = "";
		supportImageType();
		
		try{
						
			imagePath = "C:/Users/DKI/Desktop/랜섬웨어예방절차.jpg";
			File imagefile = new File(imagePath);
			image = ImageIO.read(imagefile);
						
			if(image == null){
				System.out.println(imagePath + "파일을 찾을수 없음");
			} else {
				
				int pos = imagePath.lastIndexOf(".");
				String itype = imagePath.substring(pos+1);
				int pos2 = imagePath.lastIndexOf("/");
				String ipath = imagePath.substring(0, pos2+1);
				String iname = imagePath.substring(pos2+1, pos+1);
				
				System.out.println(itype);
				System.out.println(ipath);
				
				if(itype.equals("png")){
					ImageIO.write(image, "jpg", new File(ipath+iname+"_convert.jpg"));
				} else if(itype.equals("jpg")){
					ImageIO.write(image, "png", new File(ipath+iname+"_convert.png"));
				}
				System.out.println("성공");
			}
			
		}
		
		catch(IIOException e) {
			System.err.println("파일을 찾을수 없음");
		}
		catch(IOException ex){
			ex.printStackTrace();
		}
		
	}

	public static void supportImageType(){
		String readName[] = ImageIO.getReaderFormatNames();
		for(int i = 0; i < readName.length; i ++ ){
			System.out.println(readName[i]);
		}
		
		System.out.println("=============================");
		
		String writerName[] = ImageIO.getWriterFormatNames();
		for(int i = 0; i < writerName.length; i ++ ){
			System.out.println(writerName[i]);
		}
		System.out.println("==================");
	}
}
