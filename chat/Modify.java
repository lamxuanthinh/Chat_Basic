package chat;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;

public  class Modify {

    public static void SavaFile(String text) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("data.txt", true);
            String line = text;
            byte b[] = line.getBytes("utf-8");
            fos.write(b);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Modify.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Modify.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Modify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException ex) {
                    Logger.getLogger(Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    public static void saveAs(String address, String text){
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(address, true);
            String line = text;
            byte b[] = line.getBytes("utf-8");
            fos.write(b);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Modify.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Modify.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Modify.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(fos != null){
            try {
                fos.close();
            } catch (IOException ex) {
                Logger.getLogger(Modify.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public static String openFile(String address) {
        FileInputStream f = null;
        StringBuffer buffer = new StringBuffer();
        try {
            f = new FileInputStream(address);
            int code;
            while ((code = f.read()) != -1) {
                buffer.append((char) code);
            }
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        } finally {
            if (f != null) {
                try {
                    f.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return buffer.toString();
    }
}
