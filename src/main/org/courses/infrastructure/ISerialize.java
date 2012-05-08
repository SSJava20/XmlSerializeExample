package main.org.courses.infrastructure;

import main.org.courses.Person;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * Created with IntelliJ IDEA.
 * User: stvad
 * Date: 07.05.12
 * Time: 23:48
 * To change this template use File | Settings | File Templates.
 */
public interface ISerialize
{
    public void Write(Object toWrite, File to) throws FileNotFoundException;

    public Object Read(File from) throws FileNotFoundException;
}
