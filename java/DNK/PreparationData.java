package DNK;

import java.io.*;


public class PreparationData {
    //подготовка данных


    public static void main(String[] args) throws IOException {
        writeDNK("res\\Genome_1-1.txt","result\\gen1-3.txt",3);
        writeDNK("res\\Genome_1-1.txt","result\\gen1-5.txt",5);
        writeDNK("res\\Genome_1-1.txt","result\\gen1-9.txt",9);
        writeDNK("res\\Genome_2-1.txt","result\\gen2-3.txt",3);
        writeDNK("res\\Genome_2-1.txt","result\\gen2-5.txt",5);
        writeDNK("res\\Genome_2-1.txt","result\\gen2-9.txt",9);



    }
    public static void writeDNK(String nameOfInFile,String nameOfOutFile, int length) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(
                new FileReader(nameOfInFile));
        FileWriter writer = new FileWriter(nameOfOutFile);


        String s = bufferedReader.readLine();
        int lenS = length - 1;
        LoopBuffer gen = new LoopBuffer(length);
        char [] chars;

        while(s != null) {
            chars = s.toCharArray();
            for (char c1 : chars) {
                gen.put(c1);
                if(lenS == 0){
                    writer.write(gen.get());
                    writer.write('\n');
                }else {
                    lenS--;
                }
            }
            writer.flush();
            s = bufferedReader.readLine();
        }
        writer.close();
    }
}
