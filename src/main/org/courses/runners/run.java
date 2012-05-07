package main.org.courses.runners;

import main.org.courses.Person;
import main.org.courses.infrastructure.ISerialize;
import main.org.courses.infrastructure.XmlSerialize;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * Created with IntelliJ IDEA.
 * User: stvad
 * Date: 07.05.12
 * Time: 23:57
 * To change this template use File | Settings | File Templates.
 */
public class run
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Person somePerson = new Person();
        somePerson.setName("vasiliy");
        somePerson.setSName("pupkin");
        ISerialize serialize= new XmlSerialize();
        serialize.Write(somePerson, new File("tfile"));
    }
}
