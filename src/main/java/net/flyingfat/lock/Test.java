package net.flyingfat.lock;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Test {
	
	
	

	public static void main(String[] args) throws Exception {
		
		//ReentrantReadWriteLock lock=new ReentrantReadWriteLock();
		//lock.readLock().lock();
		//String a="abc";
		//System.out.println(a);
		//System.out.println(a.toUpperCase()==a);
		//FileChannel fileChannel=input.getChannel();
		//fileChannel.read(ByteBuffer.allocate(1024));
		//FileInputStream file=new FileInputStream(new File());
		read();
		
	}
	
	
	public static void read() throws Exception{
		FileInputStream input=new FileInputStream("E:\\git\\blog-case\\blog-case\\src\\main\\resources\\config.properties");
		int len=0;
		while((len=input.read())!=-1){
			System.out.println("read:"+len);
			Thread.sleep(1000);
		}
	}
	


}
