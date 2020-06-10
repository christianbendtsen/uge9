package com.company;

import java.io.*;


public class Main {

    public static void main(String[] args) throws IOException {


    File file = new File("/Users/ChristianBendtsen/Desktop/alice.rtf");

    //
    FileInputStream fileStream = new FileInputStream(file);
    InputStreamReader input = new InputStreamReader(fileStream);
    BufferedReader reader = new BufferedReader(input);


        String line;

        // Initializing counters
        int antalOrd = 0;
        int antalBogstaver = 0;

        // Reading line by line from the
        // file until a null is returned
        while((line = reader.readLine()) != null)
        {

            if(!(line.equals("")))
            {

                antalBogstaver += line.length();

                // \\s+ is the space delimiter in java
                String[] wordList = line.split("\\s+");

                antalOrd += wordList.length;


            }
        }

        System.out.println("Total antal ord = " + antalOrd);
        System.out.println("Total antal bogstaver = " + antalBogstaver);



    }




    /*public static void countWords(final Path file) throws IOException {
        Arrays.stream(new String(Files.readAllBytes(file), StandardCharsets.UTF_8).split("\\W+"))
                .collect(Collectors.groupingBy(Function.<String>identity(), TreeMap::new, counting())).entrySet()
                .forEach(System.out::println);



    }*/

}





