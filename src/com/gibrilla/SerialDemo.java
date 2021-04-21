package com.gibrilla;
import java.io.*;
import java.io.Serializable;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.NotSerializableException;
import java.sql.SQLException;
import java.sql.Savepoint;

public class SerialDemo {
    public static void main(String[] args) throws Exception
    {
save obj = new save();
obj.i = 4;

        File f = new File("obj.txt");
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(obj);

    }

    private static class save {
        public int i;


    }
}
class Save implements Serializable {
    int i;
}
