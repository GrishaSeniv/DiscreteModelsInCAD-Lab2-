
import algorithms.Algorithms;
import fileReader.FileReaderMatrixSize;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        //Зпарсити файл l2.txt
        String fileIn = "C:\\Users\\Grisha\\Desktop\\Ну ЛП\\4 курс\\2 семестр\\Дискретна математика\\Lab2\\Chinese-Postman Problem\\Data\\l2-2.txt";
        String fileOut = "C:\\Users\\Grisha\\Desktop\\Ну ЛП\\4 курс\\2 семестр\\Дискретна математика\\Lab2\\Chinese-Postman Problem\\Data\\Out.txt";
        FileReaderMatrixSize fileReaderMatrixSize = new FileReaderMatrixSize(fileIn, fileOut);
        fileReaderMatrixSize.fileReaderFirstNumber();
        fileReaderMatrixSize.workWithMatrix();
        fileReaderMatrixSize.writeToTxt();

        //Запуск алгоритму Листоноші
        String alg;
        String path;
        float mutatePercent = 0f;
        int nPop = 0;
        int execTime = 0;
        alg = "greedy";
        path = "C:\\Users\\Grisha\\Desktop\\Ну ЛП\\4 курс\\2 семестр\\Дискретна математика\\Lab2\\Chinese-Postman Problem\\Data\\Out.txt";
        Algorithms.valueOf(alg).run(path, mutatePercent, nPop, execTime);

        //if (args.length == 4) {
        //     alg = args[0];
        //     path = args[1];
        //     mutatePercent = Float.parseFloat(args[2]);
        //     nPop = Integer.parseInt(args[3]);
        //     execTime = Integer.parseInt(args[4]);
        //     Algorithms.valueOf(alg).run(path, mutatePercent, nPop, execTime);
        // } else {
        //    System.out.println("Informe o algoritmo <greedy, genetic, psr> e caminho apra o grafo de entrada!");
        //}
    }
}
