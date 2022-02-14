package pl.szymonswierzbin.Z3;
import java.io.File;
import java.util.Scanner;
public class Main {
    public static File[] podKatalogi(String path){
        File pliki=new File(path);
        return pliki.listFiles(file->file.isDirectory());
    }
    public static void main(String[] args){
        Scanner skanuj = new Scanner(System.in);

    }
}
