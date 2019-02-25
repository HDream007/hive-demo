package com.rimi.serializable;
/**
 * 序列化与反序列化
 */

import java.io.*;
import java.text.MessageFormat;

public class Serializable  {
    public static void main(String[] args) throws Exception{
        SerializableUser();
        User user = DeserializableUser();
        System.out.println(MessageFormat.format("name={0},age={1},sex={2}",user.getName()+"=="+user.getAge()+user.getSex()));

    }

    /**
     * 反序列化
     */
    private static User DeserializableUser() throws Exception {
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("C:\\Users\\admin\\Desktop\\User.txt"));
        User user = (User) inputStream.readObject();
        System.out.println("反序列化成功");
        inputStream.close();
        return user;
    }

    /**
     * 序列化
     */
    private static void SerializableUser() throws Exception {
        User user = new User("王五",22,"男");
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("C:\\Users\\admin\\Desktop\\User.txt"));
        outputStream.writeObject(user);
        System.out.println("序列化成功");
        outputStream.close();
    }
}
