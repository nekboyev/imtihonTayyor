package task3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Main3 {
    public static void main(String[] args) throws IOException {
        String fileName="Password.txt";
        String folderName = "Task3uchun";
        Path searchedPath=null;
        Path path=Path.of(folderName);
        List<Path> list = Files.walk(path).toList();
        for (int i = 0; i < list.size() ; i++) {
            if (list.get(i).getFileName().toString().equals(fileName)){
                searchedPath=list.get(i);
                          }
        }

        Pattern pattern=Pattern.compile("[a-zA-Z]");
        Pattern pattern1=Pattern.compile("[0-9]");
        BufferedReader bufferedReader=new BufferedReader(new FileReader(searchedPath.toString()));
        while (bufferedReader.ready()){
            String s = bufferedReader.readLine();
            Matcher matcher = pattern.matcher(s);
            Matcher matcher1 = pattern1.matcher(s);
            if (s.length()>=8&&matcher.find()&&matcher1.find()){
                System.out.println(s);
            }
        }

    }
}
