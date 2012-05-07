package main.org.courses.infrastructure;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.thoughtworks.xstream.*;
import com.thoughtworks.xstream.io.xml.DomDriver;
import main.org.courses.Person;

/**
 * Created with IntelliJ IDEA.
 * User: stvad
 * Date: 07.05.12
 * Time: 23:46
 * To change this template use File | Settings | File Templates.
 */

public class XmlSerialize implements ISerialize
{

    @Override
    public void Write(Person toWrite, File to) throws FileNotFoundException
    {
        //Serializer
        XStream xs = new XStream();
        FileOutputStream fs = new FileOutputStream(to);
        //Write to a file in the file system
        xs.toXML(toWrite, fs);

    }

    @Override
    public Person Read(Person toWrite, File from) throws FileNotFoundException
    {
        XStream xs = new XStream(new DomDriver());
        Person result = new Person();

        FileInputStream fis = new FileInputStream(from);
        xs.fromXML(fis, result);

        return result;
    }
}