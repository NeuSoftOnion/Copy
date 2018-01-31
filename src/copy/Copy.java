package copy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Copy {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//获取一个文件 --- 安装包 --- 可执行文件
		File file = new File("D:\\安装包\\Sublime Text3_86.exe");
		//通过字节输入流进行读取
		InputStream is = new FileInputStream(file);
		//用字节数组接收文件流
		byte[] b = new byte[(int) file.length()];
		is.read(b);
		//System.out.println("读入完毕");
		//通过字节输出流进行写入
		OutputStream os = new FileOutputStream(new File("C:\\Users\\www\\Desktop\\Sublime Text3_86.exe"));
		os.write(b);
		//System.out.println("写入完毕");
		os.close();
		is.close();
	}

}
