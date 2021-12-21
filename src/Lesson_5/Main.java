package Lesson_5;

import com.sun.xml.internal.ws.api.message.Header;

import java.io.*;


public class Main {

    public static void main(String[] args) {

        String [] header = new String[] {"Value 1", "Value 2", "Value 3"};
        int[][] data = new int[][]{{100, 200, 300},
                                   {111, 222, 333}};

            try {
                FileOutputStream fos = new FileOutputStream("demo.csv");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(header);
                oos.close();
                System.out.println("File Saved");
            } catch (Exception e) {
                System.out.println("Error");
            }


            try {
                FileInputStream fis = new FileInputStream("demo.csv");
                ObjectInputStream ois = new ObjectInputStream(fis);
                Header[] headerSave = (Header[]) ois.readObject();
                ois.close();
                System.out.println("File Imported");
            } catch (Exception e) {
                System.out.println("Error");
            }
    }
}
