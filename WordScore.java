import java.io.*;
import java.util.*;
public class WordScore {

    public static void main(String[] args) {
        LinkedHashMap<Character, Integer> alphabetValues=new LinkedHashMap<>();
        ArrayList<String> stringFile=new ArrayList<>();
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the File name:");
        String filename=scanner.nextLine();
        try{File file = new File(filename);
            scanner=new Scanner(file);
            while (scanner.hasNextLine()) {
                stringFile.add(scanner.nextLine());
            }

        }catch(FileNotFoundException e){
            System.out.println("File not founf ASKIES!!");
        }finally{
            if(scanner!=null){
                scanner.close();
            }
        }
        String alphabet="abcdefghijklnmopqrswqyz";
        char[] charAlphabet=alphabet.toCharArray();
        int i;
        // for(i=0;i<charAlphabet.length;i++){
        //     alphabetValues.put(charAlphabet[i], null);//added the alphabet to the linked list
        // }
        for(String fileContent: stringFile){
            String[] splitByNewLine=fileContent.split("/n");
           String[] splitBySpace1=splitByNewLine[0].split(" ");
           
            for(int s=0;s<splitByNewLine.length;s++){
                String[] splitBySpace=splitByNewLine[0].split(" ");
                for(int j=0;j!=splitBySpace.length;j++){

                    if(splitBySpace[j].equals("1")||splitBySpace[j].equals("2")||splitBySpace[j].equals("3")||splitBySpace[j].equals("4")||splitBySpace[j].equals("5")||splitBySpace[j].equals("6")||splitBySpace[j].equals("7")||splitBySpace[j].equals("8")||splitBySpace[j].equals("9")){
                        int intNumValue=Integer.parseInt(splitBySpace[j]);
                    // System.out.println("the int value is"+intNumValue);
                        alphabetValues.put(charAlphabet[j], intNumValue);

                    }
                    //else{continue;}
                }
            }
               
            //System.out.println("the followingt os the values in the liist  for the alphabet "+ alphabetValues);        
        } System.out.println(alphabetValues);  

        
    }
    
}
