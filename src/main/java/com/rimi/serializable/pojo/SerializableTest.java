package com.rimi.serializable.pojo;

import java.io.*;

public class SerializableTest {

    public static void main(String[] args) throws Exception {
        //序列化
        SerializableDemo();

        //反序列化
        DeserializableDemo();
    }

    private static void DeserializableDemo() throws IOException, ClassNotFoundException {

        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("C:\\Users\\admin\\Desktop\\User.txt"));
        Person person = (Person) inputStream.readObject();
        System.out.println(person);

    }

    private static void SerializableDemo() throws Exception{
        Person person  = new Person();
        person.setId(1L);
        person.setName("张三");
        person.setAge(22);

        FileOutputStream out = new FileOutputStream("C:\\Users\\admin\\Desktop\\User.txt");
        ObjectOutputStream outputStream = new ObjectOutputStream(out);
        outputStream.writeObject(person);
        outputStream.close();
    }


}
