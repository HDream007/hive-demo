package com.rimi.avro.pojo;

import org.apache.avro.file.DataFileReader;
import org.apache.avro.file.DataFileWriter;
import org.apache.avro.specific.SpecificDatumReader;
import org.apache.avro.specific.SpecificDatumWriter;

import java.io.File;

public class Demo {
    public static void main(String[] args) throws Exception {
      /*  Person person = new Person();
        person.setId(1);
        person.setName("张三");
        person.setAge(20);

        //序列化
        SpecificDatumWriter<Person> datumWriter = new SpecificDatumWriter<>(Person.class);

        DataFileWriter<Person> writer = new DataFileWriter<>(datumWriter);

        writer.create(person.getSchema(),new File("C:\\Users\\admin\\Desktop\\avro.txt"));

        writer.append(person);

        writer.close();*/


      /*  //反序列化

        DataFileReader<Person> people = new DataFileReader<>(new File("C:\\Users\\admin\\Desktop\\avro.txt"), new SpecificDatumReader<>(Person.class));
        while (people.hasNext()) {
            Person person1 = people.next();
            System.out.println(person1.getName());
        }
        people.close();
*/

     /* //序列化
        Person person = new Person();
        person.setId(1);
        person.setName("张三");
        person.setAge(20);

        SpecificDatumWriter<Person> datumWriter = new SpecificDatumWriter<>(Person.class);
        DataFileWriter<Person> writer = new DataFileWriter<>(datumWriter);

        writer.create(person.getSchema(), new File("C:\\Users\\admin\\Desktop\\avro.txt"));
        writer.append(person);
        writer.close();*/


        //反序列化
        DataFileReader<Person> people = new DataFileReader<>(new File("C:\\Users\\admin\\Desktop\\avro.txt"), new SpecificDatumReader<>(Person.class));
        while (people.hasNext()) {
            Person next = people.next();
            System.out.println(next);
        }


    }
}
