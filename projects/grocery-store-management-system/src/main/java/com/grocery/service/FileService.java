package com.grocery.service;

import java.io.*;

public class FileService<T> {
    public void save(String fileName, T object) throws IOException {
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(fileName));
        os.writeObject(object);
        os.close();

    }

    public T load(String fileName) throws IOException, ClassNotFoundException {
        ObjectInputStream is = new ObjectInputStream(new FileInputStream(fileName));
        T object = (T) is.readObject();
        is.close();
        return object;
    }
}
