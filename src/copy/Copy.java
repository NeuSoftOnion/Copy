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
		//��ȡһ���ļ� --- ��װ�� --- ��ִ���ļ�
		File file = new File("D:\\��װ��\\Sublime Text3_86.exe");
		//ͨ���ֽ����������ж�ȡ
		InputStream is = new FileInputStream(file);
		//���ֽ���������ļ���
		byte[] b = new byte[(int) file.length()];
		is.read(b);
		//System.out.println("�������");
		//ͨ���ֽ����������д��
		OutputStream os = new FileOutputStream(new File("C:\\Users\\www\\Desktop\\Sublime Text3_86.exe"));
		os.write(b);
		//System.out.println("д�����");
		os.close();
		is.close();
	}

}
