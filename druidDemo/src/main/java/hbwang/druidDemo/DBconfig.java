package hbwang.druidDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class DBconfig {
	public static Properties getProperties() {
		String path = Class.class.getClass().getResource("/").getPath() + "dbconfigure.properties";
		System.out.println("Begin load database dbconfig.properties");
		try {
			System.out.println(path);
			FileInputStream fis = new FileInputStream(path);
			Properties p = new Properties();
			p.load(fis);
			System.out.println("Done!");
			return p;
		} catch (FileNotFoundException e) {
			System.err.println("该  \"" + path + " \" 路径下的文件没有找到!");
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println("该  \"" + path + " \" 路径中的文件读取失败!");
			e.printStackTrace();
		}
		return null;
	}
}
