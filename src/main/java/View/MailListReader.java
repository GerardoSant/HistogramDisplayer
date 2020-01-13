package View;

import Model.Mail;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MailListReader {

    public List<Mail> read(String fileName){

         // DOS EJEMPLOS PARA HACER EL MÉTODO CON PROGRAMACIÓN FUNCIONAL

        //EJEMPLO 1

        /*List<Mail> list = new ArrayList<>();
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
            stream.filter(line -> isMail(line)).forEach(line -> list.add(new Mail(line)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list*/

        //EJEMPLO 2

        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
            return stream.filter(line -> Mail.isMail(line)).map(line-> new Mail(line)).collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


}
