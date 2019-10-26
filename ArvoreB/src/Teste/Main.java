package Teste;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String[] args){
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\1410897bcc\\Desktop\\teste.txt"))){
            String line = br.readLine();
            List l = new ArrayList<Endereco>();
            int i = 0;
            while (line != null) {
                String[] x = line.split("  ");
                Endereco e = new Endereco(x[0], x[1], x[2], x[3], x[4]);
                l.add(e);
                System.out.println(l.get(i));
                i++;
                line = br.readLine();
            }


        }catch (IOException e){
            System.out.println(e.getClass());
        }

    }
}
